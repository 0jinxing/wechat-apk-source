package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;

public final class FriendSnsPreference extends IconPreference
{
  private Context context;
  private String yhW = null;
  private Bitmap yhX = null;
  private long yhY;

  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  public final void aqD(String paramString)
  {
    AppMethodBeat.i(29303);
    this.yhX = null;
    this.yeV = -1;
    this.yhW = paramString;
    this.yhY = 0L;
    if (this.olR != null)
      a.b.b(this.olR, paramString);
    AppMethodBeat.o(29303);
  }

  public final void mX(long paramLong)
  {
    AppMethodBeat.i(29304);
    this.yhW = null;
    this.yhX = null;
    this.yeV = -1;
    this.yhY = paramLong;
    if ((this.yhY != 0L) && (this.olR != null))
      ((m)g.K(m.class)).a(this.yhY, this.olR, this.mContext.hashCode());
    AppMethodBeat.o(29304);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(29305);
    super.onBindView(paramView);
    if ((this.yhW != null) && (g.RK()))
      a.b.b(this.olR, this.yhW);
    if ((this.yhY != 0L) && (this.olR != null))
      ((m)g.K(m.class)).a(this.yhY, this.olR, this.mContext.hashCode());
    AppMethodBeat.o(29305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FriendSnsPreference
 * JD-Core Version:    0.6.2
 */