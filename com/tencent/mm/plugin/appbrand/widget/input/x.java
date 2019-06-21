package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public abstract class x extends i
{
  final void a(y paramy)
  {
    if (paramy == null)
      ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl failed, EditText is null");
    while (true)
    {
      return;
      int i = paramy.getInputId();
      paramy.b(this.jdO);
      if (this.jdT == null);
      for (paramy = null; ; paramy = (u)this.jdT.get())
      {
        if (paramy != null)
          break label73;
        ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(i) });
        break;
      }
      label73: paramy = paramy.aBf();
      if (paramy == null)
        ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(i) });
      else
        ab.i("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) success = %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramy.pv(i)) });
    }
  }

  final boolean a(y paramy, e parame)
  {
    boolean bool = false;
    if (paramy == null)
      ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl failed, EditText is null");
    int i;
    Object localObject;
    while (true)
    {
      return bool;
      i = parame.jdk;
      if (this.jdT != null)
      {
        localObject = (u)this.jdT.get();
        if (localObject != null);
      }
      else
      {
        ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(i) });
        continue;
      }
      localObject = ((u)localObject).aBf();
      if (localObject != null)
        break;
      ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(i) });
    }
    int j;
    label121: int k;
    float f1;
    float f2;
    float f3;
    float f4;
    if ((parame.jjE != null) && (parame.jjE.booleanValue()))
    {
      j = 4;
      k = parame.jji;
      f1 = parame.jjs.intValue();
      f2 = parame.jjr.intValue();
      f3 = parame.jjp.intValue();
      f4 = parame.jjq.intValue();
      if ((parame.jjI == null) || (!parame.jjI.booleanValue()))
        break label263;
    }
    label263: for (bool = true; ; bool = false)
    {
      bool = ((ac)localObject).a(paramy, i, k, new float[] { f1, f2, f3, f4, 0.0F }, j, bool, false);
      ab.i("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) success = %s, ", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      break;
      j = 0;
      break label121;
    }
  }

  final boolean b(y paramy, e parame)
  {
    boolean bool = false;
    if (paramy == null)
      ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition failed, EditText is null");
    int i;
    while (true)
    {
      return bool;
      i = paramy.getInputId();
      if (this.jdT != null)
      {
        paramy = (u)this.jdT.get();
        if (paramy != null);
      }
      else
      {
        ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(i) });
        continue;
      }
      paramy = paramy.aBf();
      if (paramy != null)
        break;
      ab.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(i) });
    }
    if ((parame.jjE != null) && (parame.jjE.booleanValue()));
    for (int j = 4; ; j = 0)
    {
      float f1 = parame.jjs.intValue();
      float f2 = parame.jjr.intValue();
      float f3 = parame.jjp.intValue();
      float f4 = parame.jjq.intValue();
      parame = parame.jjI;
      Boolean localBoolean = Boolean.FALSE;
      bool = paramy.a(i, new float[] { f1, f2, f3, f4, 0.0F }, j, parame, localBoolean);
      ab.i("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) success = %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.x
 * JD-Core Version:    0.6.2
 */