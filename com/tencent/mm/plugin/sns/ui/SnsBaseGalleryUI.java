package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.am;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.l;

public abstract class SnsBaseGalleryUI extends MMActivity
  implements s.a
{
  private LinearLayout jXf;
  private LinearLayout rpj;
  r rpk;
  s rpl;
  private boolean rpm = true;
  private boolean rpn = true;
  private TextView rpo = null;
  protected SnsInfoFlip rpp;
  protected Button rpq;

  @SuppressLint({"ResourceAsColor"})
  public final void D(boolean paramBoolean, int paramInt)
  {
    this.rpk = new r(this, paramInt, paramBoolean);
    this.rpk.setBackgroundColor(2131690597);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.rpk.getBackground().setAlpha(50);
    this.jXf.addView(this.rpk, localLayoutParams);
    paramInt = getIntent().getIntExtra("sns_source", 0);
    this.rpk.setSnsSource(paramInt);
  }

  public void addView(View paramView)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.rpj.addView(paramView, localLayoutParams);
  }

  public void crM()
  {
    int i = 8;
    boolean bool = false;
    if (!this.rpm)
      return;
    label23: r localr;
    if (this.rpn)
    {
      j = 8;
      setTitleVisibility(j);
      if (this.rpk != null)
      {
        localr = this.rpk;
        if (!this.rpn)
          break label78;
      }
    }
    label78: for (int j = i; ; j = 0)
    {
      localr.setVisibility(j);
      if (!this.rpn)
        bool = true;
      this.rpn = bool;
      break;
      j = 0;
      break label23;
    }
  }

  public final void crN()
  {
    this.rpn = false;
    setTitleVisibility(8);
    if (this.rpk != null)
      this.rpk.setVisibility(8);
  }

  public void dg(String paramString, int paramInt)
  {
  }

  public void dh(String paramString, int paramInt)
  {
    if ((!this.rpm) || (af.cnn()));
    while (true)
    {
      return;
      paramString = af.cnF().YT(paramString);
      if ((paramString == null) || (paramString.field_snsId == 0L))
        enableOptionMenu(false);
      else
        enableOptionMenu(true);
    }
  }

  public int getLayoutId()
  {
    return 2130970761;
  }

  public final void gt(String paramString1, String paramString2)
  {
    if (!this.rpm);
    while (true)
    {
      return;
      setMMTitle(paramString1);
      setMMSubTitle(paramString2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    af.cnA().aa(3, true);
    this.rpj = ((LinearLayout)findViewById(2131827690));
    this.jXf = ((LinearLayout)findViewById(2131821019));
    this.rpl = new s(this, this);
    paramBundle = this.rpl;
    ab.i("MicroMsg.GalleryTitleManager", "onAttach");
    g.RQ();
    g.RO().eJo.a(218, paramBundle);
    a.xxA.c(paramBundle.mip);
    a.xxA.c(paramBundle.riJ);
  }

  public void onDestroy()
  {
    super.onDestroy();
    Object localObject;
    if (this.rpl != null)
    {
      localObject = this.rpl;
      ab.i("MicroMsg.GalleryTitleManager", "onDetch");
      g.RQ();
      g.RO().eJo.b(218, (f)localObject);
      a.xxA.d(((s)localObject).mip);
      a.xxA.d(((s)localObject).riJ);
    }
    if (this.rpp != null)
    {
      localObject = this.rpp;
      if ((((SnsInfoFlip)localObject).rsn != null) && ((((SnsInfoFlip)localObject).rsn instanceof MMGestureGallery)))
      {
        localObject = (MMGestureGallery)((SnsInfoFlip)localObject).rsn;
        ((MMGestureGallery)localObject).zFC.release();
        ((MMGestureGallery)localObject).zFD.release();
        ((MMGestureGallery)localObject).zFB.release();
      }
      this.rpp.onDestroy();
    }
  }

  public void onPause()
  {
    if (this.rpp != null)
      this.rpp.onPause();
    if (this.rpl != null)
    {
      s locals = this.rpl;
      if (locals.riC != null)
      {
        am localam = new am();
        localam.ctA.activity = ((Activity)locals.context);
        localam.ctA.ctB = locals.riC;
        a.xxA.m(localam);
        locals.riC = null;
        locals.cvo = 0;
        locals.cvn = 0;
      }
    }
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (this.rpk != null)
      this.rpk.refresh();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
 * JD-Core Version:    0.6.2
 */