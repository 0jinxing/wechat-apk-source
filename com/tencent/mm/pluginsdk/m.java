package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.ai.g;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi.a;

@Deprecated
public abstract interface m
{
  public abstract String B(String paramString1, String paramString2);

  public abstract void BS();

  public abstract void BU();

  public abstract void BV();

  public abstract Intent BW();

  public abstract boolean BX();

  public abstract void BY();

  public abstract boolean BZ();

  public abstract Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);

  public abstract com.tencent.mm.ai.m a(g paramg);

  public abstract void a(Context paramContext, ad paramad, bi.a parama, Bundle paramBundle, String paramString);

  public abstract void a(Context paramContext, bi.a parama, Bundle paramBundle);

  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5);

  public abstract void a(Intent paramIntent, String paramString);

  public abstract void a(bbv parambbv, String paramString);

  public abstract void a(String paramString1, String paramString2, String paramString3, long paramLong);

  public abstract boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString);

  public abstract boolean a(ad paramad);

  public abstract boolean b(Context paramContext, int paramInt1, int paramInt2, String paramString);

  public abstract void bc(Context paramContext);

  public abstract com.tencent.mm.ai.m bj(boolean paramBoolean);

  public abstract String df(String paramString);

  public abstract boolean dg(String paramString);

  public abstract boolean dk(String paramString);

  public abstract void dl(String paramString);

  public abstract String f(Context paramContext, String paramString1, String paramString2);

  public abstract void gk(int paramInt);

  public abstract boolean o(Activity paramActivity);

  public abstract void p(Activity paramActivity);

  public abstract String t(Context paramContext, String paramString);

  public abstract String t(String paramString, int paramInt);

  public abstract boolean u(Context paramContext, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.m
 * JD-Core Version:    0.6.2
 */