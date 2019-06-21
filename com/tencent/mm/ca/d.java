package com.tencent.mm.ca;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.svg.b.b;

public final class d
{
  com.tencent.mm.svg.a.a xuG;

  static
  {
    AppMethodBeat.i(105917);
    com.tencent.mm.compatible.g.a.a(new d.a());
    b.pu(ah.getContext().getSharedPreferences("wechat_svg_debug", h.Mu()).getBoolean("open_tag", false));
    AppMethodBeat.o(105917);
  }

  public d()
  {
    AppMethodBeat.i(105914);
    this.xuG = new com.tencent.mm.svg.a.a();
    AppMethodBeat.o(105914);
  }

  public static void oZ(boolean paramBoolean)
  {
    AppMethodBeat.i(105916);
    ah.getContext().getSharedPreferences("wechat_svg_debug", h.Mu()).edit().putBoolean("open_tag", paramBoolean).commit();
    b.pu(paramBoolean);
    AppMethodBeat.o(105916);
  }

  public final Drawable f(Resources paramResources, int paramInt)
  {
    AppMethodBeat.i(105915);
    Drawable localDrawable = null;
    if (this.xuG.g(paramResources, paramInt))
      localDrawable = com.tencent.mm.svg.a.a.f(paramResources, paramInt);
    AppMethodBeat.o(105915);
    return localDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.d
 * JD-Core Version:    0.6.2
 */