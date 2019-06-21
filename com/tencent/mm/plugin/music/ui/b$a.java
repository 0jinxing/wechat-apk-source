package com.tencent.mm.plugin.music.ui;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.model.c;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b$a
{
  private int mode;
  a oMw;
  View oOA;
  View oOB;
  View oOC;
  CdnImageView oOD;
  TextView oOE;
  TextView oOF;
  LyricView oOG;
  boolean oOH;
  private Animation.AnimationListener oOI;
  MusicItemLayout oOz;

  public b$a(b paramb)
  {
    AppMethodBeat.i(105078);
    this.mode = 1;
    this.oOI = new b.a.3(this);
    AppMethodBeat.o(105078);
  }

  public final boolean bUM()
  {
    if (this.mode == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bUN()
  {
    AppMethodBeat.i(105080);
    if ((this.oOH) || (this.mode == 1))
      AppMethodBeat.o(105080);
    while (true)
    {
      return;
      com.tencent.mm.plugin.music.model.d.d.eJ(3, this.oOy.scene);
      if (this.oOy.oOw == 0)
      {
        this.oOy.oOw = this.oOA.getMeasuredHeight();
        localObject = new LinearLayout.LayoutParams(-1, this.oOy.oOw);
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
        this.oOA.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      com.tencent.mm.plugin.music.model.d.d.oNj = true;
      com.tencent.mm.plugin.music.model.d.d.bUt();
      this.mode = 1;
      this.oOH = true;
      Object localObject = new a(this.oOG, this.oOy.oOs);
      ((a)localObject).setDuration(500L);
      ((a)localObject).setAnimationListener(this.oOI);
      this.oOG.startAnimation((Animation)localObject);
      AppMethodBeat.o(105080);
    }
  }

  public final void bUO()
  {
    AppMethodBeat.i(105081);
    if ((this.oOH) || (this.mode == 2))
      AppMethodBeat.o(105081);
    while (true)
    {
      return;
      com.tencent.mm.plugin.music.model.d.d.eJ(2, this.oOy.scene);
      if (this.oOy.oOw == 0)
      {
        this.oOy.oOw = this.oOA.getMeasuredHeight();
        localObject = new LinearLayout.LayoutParams(-1, this.oOy.oOw);
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
        this.oOA.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      com.tencent.mm.plugin.music.model.d.d.oNj = true;
      com.tencent.mm.plugin.music.model.d.d.bUt();
      this.mode = 2;
      this.oOH = true;
      Object localObject = new a(this.oOG, this.oOy.oOt);
      ((a)localObject).setDuration(500L);
      ((a)localObject).setAnimationListener(this.oOI);
      this.oOG.startAnimation((Animation)localObject);
      AppMethodBeat.o(105081);
    }
  }

  public final void bUP()
  {
    AppMethodBeat.i(105082);
    com.tencent.mm.plugin.music.model.d.d.oNj = true;
    com.tencent.mm.plugin.music.model.d.d.bUt();
    if (this.mode == 1)
    {
      bUO();
      AppMethodBeat.o(105082);
    }
    while (true)
    {
      return;
      bUN();
      AppMethodBeat.o(105082);
    }
  }

  public final void d(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(105079);
    if (parama != null)
    {
      ab.i("MicroMsg.Music.MusicMainAdapter", "updateView %s", new Object[] { parama.field_songName });
      this.oMw = parama;
      if (bo.isNullOrNil(parama.field_songHAlbumUrl))
        ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).a(parama, this.oOy.oMH);
      this.oOz.setTag(this);
      if (((com.tencent.mm.plugin.music.model.d.a(parama)) && (this.oOy.scene != 3)) || (bo.isNullOrNil(parama.field_songSinger)))
        break label226;
      this.oOF.setText(parama.field_songSinger);
      this.oOF.setVisibility(0);
    }
    while (true)
    {
      this.oOE.setText(parama.field_songName);
      this.oOE.setTag(parama.field_songName);
      this.oOG.setLyricObj(com.tencent.mm.plugin.music.model.e.bUk().b(parama, this.oOy.oMH));
      if ((!com.tencent.mm.plugin.music.model.d.a(parama)) || (this.oOy.oMH))
        this.oOG.setCurrentTime(1L);
      bUN();
      this.oOy.oOv.a(parama, this.oOD, this.oOy.context, paramBoolean, this.oOy.oMH);
      AppMethodBeat.o(105079);
      return;
      label226: this.oOF.setVisibility(8);
    }
  }

  public final class a extends Animation
  {
    final int eTj;
    final int oOM;
    View view;

    public a(View paramInt, int arg3)
    {
      AppMethodBeat.i(105075);
      this.view = paramInt;
      int i;
      this.eTj = i;
      this.oOM = paramInt.getHeight();
      AppMethodBeat.o(105075);
    }

    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      AppMethodBeat.i(105076);
      int i = (int)(this.oOM + (this.eTj - this.oOM) * paramFloat);
      this.view.getLayoutParams().height = i;
      this.view.requestLayout();
      AppMethodBeat.o(105076);
    }

    public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(105077);
      super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(105077);
    }

    public final boolean willChangeBounds()
    {
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.b.a
 * JD-Core Version:    0.6.2
 */