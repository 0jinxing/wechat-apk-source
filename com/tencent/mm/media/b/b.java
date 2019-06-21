package com.tencent.mm.media.b;

import a.f.b.j;
import a.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/config/SimpleElementConfig;", "T", "", "()V", "elementConfig", "getElementConfig", "()Ljava/lang/Object;", "setElementConfig", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getConfig", "getFloatDynamicConfig", "", "key", "", "defValue", "getIntDynamicConfig", "", "initDefaultConfig", "loadConfig", "", "resetConfig", "update", "parse", "plugin-mediaeditor_release"})
public abstract class b<T>
{
  protected T eTh;

  protected int L(String paramString, int paramInt)
  {
    j.p(paramString, "key");
    com.tencent.mm.kernel.c.a locala;
    if (ah.bqo())
    {
      locala = g.K(com.tencent.mm.plugin.zero.b.a.class);
      j.o(locala, "MMKernel.service<IConfig…onfigService::class.java)");
    }
    for (paramInt = bo.getInt(((com.tencent.mm.plugin.zero.b.a)locala).Nu().getValue(paramString), paramInt); ; paramInt = bo.getInt(CaptureMMProxy.getInstance().getDynamicConfig(paramString), paramInt))
      return paramInt;
  }

  protected final T Ut()
  {
    Object localObject = this.eTh;
    if (localObject == null)
      j.avw("elementConfig");
    return localObject;
  }

  public abstract T Uu();

  public abstract void Uv();

  public final T Uw()
  {
    this.eTh = Uu();
    Uv();
    Object localObject = this.eTh;
    if (localObject == null)
      j.avw("elementConfig");
    return localObject;
  }

  protected final void aQ(T paramT)
  {
    j.p(paramT, "<set-?>");
    this.eTh = paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.b.b
 * JD-Core Version:    0.6.2
 */