package id.bafika.echart.options.series.other;

import java.io.Serializable;

import id.bafika.echart.options.code.X;
import id.bafika.echart.options.code.Y;

public class RootLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    private Object x;
    private Object y;

    /**
     * 构造函数
     */
    public RootLocation() {
    }

    /**
     * 构造函数,参数:x,y
     *
     * @param x
     * @param y
     */
    public RootLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(X x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(String x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取x值
	 */
	public Object x() {
        return this.x;
    }

    /**
     * 设置y值
     *
     * @param y
     */
	public RootLocation y(Y y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(String y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取y值
	 */
	public Object y() {
        return this.y;
    }

    /**
     * 获取x值
     */
	public Object getX() {
        return x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
	public void setX(Object x) {
        this.x = x;
    }

    /**
     * 获取y值
     */
	public Object getY() {
        return y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
	public void setY(Object y) {
        this.y = y;
    }
}
