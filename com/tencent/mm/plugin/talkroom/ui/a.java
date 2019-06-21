package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;

public final class a
{
  private static final int[] gcc = { 2130837686, 2130837687, 2130837688, 2130837689, 2130837690, 2130837691, 2130837692 };
  private static final int[] miN = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private Context context;
  private View miF;
  private View miG;
  private ImageView miH;
  private View miJ;
  private final ak miO;
  private int saE;
  private o szb;
  private TextView szc;
  private ImageView szd;
  private View sze;

  public a(Context paramContext)
  {
    AppMethodBeat.i(25889);
    this.miO = new a.1(this);
    this.context = paramContext;
    this.saE = BackwardSupportUtil.b.b(paramContext, 180.0F);
    this.szb = new o(((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130971021, null), -1, -2);
    this.miH = ((ImageView)this.szb.getContentView().findViewById(2131823958));
    this.miJ = this.szb.getContentView().findViewById(2131823960);
    this.szc = ((TextView)this.szb.getContentView().findViewById(2131823962));
    this.szd = ((ImageView)this.szb.getContentView().findViewById(2131823961));
    this.sze = this.szb.getContentView().findViewById(2131828470);
    this.miF = this.szb.getContentView().findViewById(2131823955);
    this.miG = this.szb.getContentView().findViewById(2131823963);
    AppMethodBeat.o(25889);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.a
 * JD-Core Version:    0.6.2
 */