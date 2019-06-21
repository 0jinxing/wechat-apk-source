package com.tencent.mm.plugin.sns.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.storage.az;

public abstract interface f
{
  public abstract String a(bau parambau);

  public abstract void a(bau parambau, View paramView, int paramInt, az paramaz);

  public abstract void ab(Activity paramActivity);

  public abstract Bitmap b(bau parambau);

  public abstract void b(bau parambau, View paramView, int paramInt, az paramaz);

  public abstract void cmm();

  public abstract void dz(View paramView);

  public abstract void pause();

  public abstract void start();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.b.f
 * JD-Core Version:    0.6.2
 */