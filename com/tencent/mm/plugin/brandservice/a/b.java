package com.tencent.mm.plugin.brandservice.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.c.a;
import java.util.List;

public abstract interface b extends a
{
  public abstract boolean FC(String paramString);

  public abstract void a(String paramString, int paramInt1, int paramInt2, Object[] paramArrayOfObject);

  public abstract boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent);

  public abstract boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, b.a parama);

  public abstract void aU(List<String[]> paramList);

  public abstract boolean aVO();

  public abstract boolean aVP();

  public abstract String aVQ();

  public abstract void aVR();

  public abstract void i(List<List<String>> paramList, int paramInt);

  public abstract boolean rW(int paramInt);

  public abstract void rX(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.a.b
 * JD-Core Version:    0.6.2
 */