package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import android.graphics.Typeface;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.protocal.protobuf.biv;
import java.util.Map;

public abstract interface b extends a
{
  public abstract void a(Map<String, Object> paramMap, String paramString1, String paramString2, int paramInt, b.a parama);

  public abstract biv bQO();

  public abstract void eA(int paramInt1, int paramInt2);

  public abstract Typeface ex(Context paramContext);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.b
 * JD-Core Version:    0.6.2
 */