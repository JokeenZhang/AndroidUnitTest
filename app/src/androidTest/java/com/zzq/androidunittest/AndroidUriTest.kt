package com.zzq.androidunittest

import android.net.Uri
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Android包Uri的Test
 */
@RunWith(AndroidJUnit4::class)
class AndroidUriTest {

    /**
     * 测试Uri转换后是否能拿到原先设置进去的参数，以及判断是否相等
     */
    @Test
    fun testUriPartSuccess() {
        val uriStr = "hensonmall://share/goods?goodsId=141"
        val uri = Uri.parse(uriStr)
        println(uri)
        Assert.assertEquals("141", uri.getQueryParameter("goodsId"))
    }
}