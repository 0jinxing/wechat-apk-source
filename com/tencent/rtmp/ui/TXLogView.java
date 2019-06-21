package com.tencent.rtmp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.TXLiveBase;
import java.text.SimpleDateFormat;

public class TXLogView extends LinearLayout
{
  StringBuffer a;
  private TextView b;
  private TextView c;
  private ScrollView d;
  private ScrollView e;
  private final int f;
  private boolean g;

  public TXLogView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TXLogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(65560);
    this.a = new StringBuffer("");
    this.f = 3000;
    this.g = false;
    setOrientation(1);
    this.b = new TextView(paramContext);
    this.c = new TextView(paramContext);
    this.d = new ScrollView(paramContext);
    this.e = new ScrollView(paramContext);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, 0);
    paramAttributeSet.weight = 0.2F;
    this.d.setLayoutParams(paramAttributeSet);
    this.d.setBackgroundColor(1627389951);
    this.d.setVerticalScrollBarEnabled(true);
    this.d.setScrollbarFadingEnabled(true);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, -1);
    this.b.setLayoutParams(paramAttributeSet);
    this.b.setTextSize(2, 11.0F);
    this.b.setTextColor(-16777216);
    this.b.setTypeface(Typeface.MONOSPACE, 1);
    this.b.setLineSpacing(4.0F, 1.0F);
    this.b.setPadding(a(paramContext, 2.0F), a(paramContext, 2.0F), a(paramContext, 2.0F), a(paramContext, 2.0F));
    this.d.addView(this.b);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, 0);
    paramAttributeSet.weight = 0.8F;
    paramAttributeSet.topMargin = a(paramContext, 2.0F);
    this.e.setLayoutParams(paramAttributeSet);
    this.e.setBackgroundColor(1627389951);
    this.e.setVerticalScrollBarEnabled(true);
    this.e.setScrollbarFadingEnabled(true);
    paramAttributeSet = new FrameLayout.LayoutParams(-1, -1);
    this.c.setLayoutParams(paramAttributeSet);
    this.c.setTextSize(2, 13.0F);
    this.c.setTextColor(-16777216);
    this.c.setPadding(a(paramContext, 2.0F), a(paramContext, 2.0F), a(paramContext, 2.0F), a(paramContext, 2.0F));
    this.e.addView(this.c);
    addView(this.d);
    addView(this.e);
    setVisibility(8);
    AppMethodBeat.o(65560);
  }

  public static int a(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(65561);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    AppMethodBeat.o(65561);
    return i;
  }

  private void a(ScrollView paramScrollView, View paramView)
  {
    AppMethodBeat.i(65567);
    if ((paramScrollView == null) || (paramView == null))
      AppMethodBeat.o(65567);
    while (true)
    {
      return;
      int i = paramView.getMeasuredHeight() - paramScrollView.getMeasuredHeight();
      int j = i;
      if (i < 0)
        j = 0;
      paramScrollView.scrollTo(0, j);
      AppMethodBeat.o(65567);
    }
  }

  protected String a(Bundle paramBundle)
  {
    AppMethodBeat.i(65564);
    paramBundle = String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", new Object[] { "CPU:" + paramBundle.getString("CPU_USAGE"), "RES:" + paramBundle.getInt("VIDEO_WIDTH") + "*" + paramBundle.getInt("VIDEO_HEIGHT"), "SPD:" + paramBundle.getInt("NET_SPEED") + "Kbps", "JIT:" + paramBundle.getInt("NET_JITTER"), "FPS:" + paramBundle.getInt("VIDEO_FPS"), "GOP:" + paramBundle.getInt("VIDEO_GOP") + "s", "ARA:" + paramBundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + paramBundle.getInt("CODEC_CACHE") + " | " + paramBundle.getInt("CACHE_SIZE") + "," + paramBundle.getInt("VIDEO_CACHE_SIZE") + "," + paramBundle.getInt("V_DEC_CACHE_SIZE") + " | " + paramBundle.getInt("AV_RECV_INTERVAL") + "," + paramBundle.getInt("AV_PLAY_INTERVAL") + "," + String.format("%.1f", new Object[] { Float.valueOf(paramBundle.getFloat("AUDIO_PLAY_SPEED")) }).toString(), "VRA:" + paramBundle.getInt("VIDEO_BITRATE") + "Kbps", "DRP:" + paramBundle.getInt("CODEC_DROP_CNT") + "|" + paramBundle.getInt("DROP_SIZE"), "SVR:" + paramBundle.getString("SERVER_IP"), "AUDIO:" + paramBundle.getString("AUDIO_PLAY_INFO") });
    AppMethodBeat.o(65564);
    return paramBundle;
  }

  public void a()
  {
    AppMethodBeat.i(65565);
    this.a.setLength(0);
    this.b.setText("");
    this.c.setText("");
    AppMethodBeat.o(65565);
  }

  protected void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(65563);
    if (paramInt == 1020)
      AppMethodBeat.o(65563);
    while (true)
    {
      return;
      String str = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
      while (this.a.length() > 3000)
      {
        int i = this.a.indexOf("\n");
        paramInt = i;
        if (i == 0)
          paramInt = 1;
        this.a = this.a.delete(0, paramInt);
      }
      this.a = this.a.append("\n[" + str + "]" + paramString);
      AppMethodBeat.o(65563);
    }
  }

  public void a(Bundle paramBundle1, Bundle paramBundle2, int paramInt)
  {
    AppMethodBeat.i(65562);
    if (this.g)
      AppMethodBeat.o(65562);
    while (true)
    {
      return;
      if ((paramInt == 2011) || (paramInt == 2012))
      {
        AppMethodBeat.o(65562);
      }
      else
      {
        if ((paramBundle1 != null) && (getVisibility() == 0))
          this.b.setText(a(paramBundle1));
        if (this.a.length() <= 0)
          this.a.append("liteav sdk version:" + TXLiveBase.getSDKVersionStr());
        if (paramBundle2 != null)
        {
          paramBundle1 = paramBundle2.getString("EVT_MSG");
          if ((paramBundle1 != null) && (!paramBundle1.isEmpty()))
          {
            a(paramInt, paramBundle1);
            if (getVisibility() == 0)
            {
              this.c.setText(this.a.toString());
              a(this.e, this.c);
            }
          }
        }
        AppMethodBeat.o(65562);
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(65566);
    int i;
    if (paramBoolean)
    {
      i = 0;
      setVisibility(i);
      if (!paramBoolean)
        break label60;
      this.c.setText(this.a.toString());
      a(this.e, this.c);
      AppMethodBeat.o(65566);
    }
    while (true)
    {
      return;
      i = 8;
      break;
      label60: this.c.setText("");
      AppMethodBeat.o(65566);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXLogView
 * JD-Core Version:    0.6.2
 */