package com.example.sseTest.services;

import com.example.sseTest.bean.RandomNumbers;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class SseServices {
    public  Flux<RandomNumbers> getRandom() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(3));
        return Flux.zip(interval, Flux.fromStream(Stream.generate(() -> new RandomNumbers(randomGenerator(1,4),"lucas")))).map(Tuple2::getT2);
    }
    public int randomGenerator(int minimum, int maximum) {
        Random rn = new Random();
        int range = maximum - minimum + 1;
        int randomNum =  rn.nextInt(range) + minimum;
        return randomNum;
    }
}
