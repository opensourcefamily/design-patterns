package com.studyinghome.singleton;

import java.io.Serializable;

/**
 * @author Leslie (panxiang_work@163.com)
 * @website https://www.studyinghome.com
 * @create 2020-05-04 下午 5:22
 */
public interface Singelton extends Serializable {
    /**
     * 对象序列化和反序列化时保证是同一对象
     *
     * @return
     */
    Object readResolve();
}
