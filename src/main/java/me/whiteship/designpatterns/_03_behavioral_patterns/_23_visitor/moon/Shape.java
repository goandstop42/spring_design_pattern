package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor.moon;

/**
 * 특정 device 마다 구현체를 만듦
 *
 */
public interface Shape {

    void accept(Device device);
}
