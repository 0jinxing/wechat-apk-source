package com.tencent.mm.audio.b;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class g$b
{
  private static boolean cqu;
  private static boolean cqv;

  static
  {
    AppMethodBeat.i(55758);
    cqu = false;
    cqv = false;
    int i = m.Lw();
    ab.i("MicroMsg.RecorderUtil", "abi: %s, abi2: %s, cpuFlag: %d", new Object[] { Build.CPU_ABI, Build.CPU_ABI2, Integer.valueOf(i) });
    if ((!bo.isNullOrNil(Build.CPU_ABI)) && (!Build.CPU_ABI.contains("armeabi")) && (!bo.isNullOrNil(Build.CPU_ABI2)) && (!Build.CPU_ABI2.contains("armeabi")))
    {
      ab.i("MicroMsg.RecorderUtil", "don't contains armeabi");
      k.a("wechatvoicesilk_v5", g.class.getClassLoader());
      Assert.assertTrue("Can't remove libwechatvoicesilk.so yet.", false);
      cqu = true;
      cqv = false;
    }
    while (true)
    {
      ab.i("MicroMsg.RecorderUtil", "finish load silk so, canUseSilkDecode: %b, canUseSilkEncode: %b", new Object[] { Boolean.valueOf(cqu), Boolean.valueOf(cqv) });
      AppMethodBeat.o(55758);
      return;
      if ((i & 0x400) != 0)
      {
        try
        {
          k.a("wechatvoicesilk_v7a", g.class.getClassLoader());
          cqu = true;
          cqv = true;
        }
        catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
        {
          ab.e("MicroMsg.RecorderUtil", "load library failed!");
          cqu = false;
          cqv = false;
        }
      }
      else if ((i & 0x200) != 0)
      {
        k.a("wechatvoicesilk", g.class.getClassLoader());
        Assert.assertTrue("Can't remove libwechatvoicesilk.so yet.", false);
        cqu = true;
        cqv = true;
      }
      else
      {
        k.a("wechatvoicesilk_v5", g.class.getClassLoader());
        Assert.assertTrue("Can't remove libwechatvoicesilk.so yet.", false);
        cqu = true;
        cqv = false;
      }
    }
  }

  public static boolean ER()
  {
    return cqu;
  }

  public static boolean ES()
  {
    return cqv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.g.b
 * JD-Core Version:    0.6.2
 */