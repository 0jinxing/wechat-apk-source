package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Timer;

public class FaceNumberView extends LinearLayout
{
  private String mbh;
  private int mbi;
  private ViewGroup mbj;
  public FaceNumberItemView[] mbk;
  private int mbl;
  private Animation mbm;
  private FaceNumberView.a mbn;

  public FaceNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public FaceNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(654);
    this.mbh = null;
    this.mbk = null;
    this.mbl = 0;
    this.mbm = null;
    this.mbn = FaceNumberView.a.mbq;
    this.mbj = ((ViewGroup)inflate(getContext(), 2130969469, null));
    addView(this.mbj);
    this.mbm = AnimationUtils.loadAnimation(getContext(), 2131034216);
    AppMethodBeat.o(654);
  }

  private static void a(FaceNumberItemView paramFaceNumberItemView, String paramString)
  {
    AppMethodBeat.i(656);
    if (paramFaceNumberItemView == null)
      AppMethodBeat.o(656);
    while (true)
    {
      return;
      if (paramString.equals("0"))
      {
        paramFaceNumberItemView.setImageResource(2130838648);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("1"))
      {
        paramFaceNumberItemView.setImageResource(2130838649);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("2"))
      {
        paramFaceNumberItemView.setImageResource(2130838650);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("3"))
      {
        paramFaceNumberItemView.setImageResource(2130838651);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("4"))
      {
        paramFaceNumberItemView.setImageResource(2130838652);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("5"))
      {
        paramFaceNumberItemView.setImageResource(2130838653);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("6"))
      {
        paramFaceNumberItemView.setImageResource(2130838654);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("7"))
      {
        paramFaceNumberItemView.setImageResource(2130838655);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("8"))
      {
        paramFaceNumberItemView.setImageResource(2130838656);
        AppMethodBeat.o(656);
      }
      else if (paramString.equals("9"))
      {
        paramFaceNumberItemView.setImageResource(2130838657);
        AppMethodBeat.o(656);
      }
      else
      {
        paramFaceNumberItemView.setImageResource(2130838658);
        AppMethodBeat.o(656);
      }
    }
  }

  private void btL()
  {
    int i = 0;
    AppMethodBeat.i(655);
    if ((this.mbk != null) && (this.mbk.length > 0))
      if (!bo.isNullOrNil(this.mbh))
      {
        i = 0;
        if (i < this.mbk.length)
        {
          String str;
          FaceNumberItemView localFaceNumberItemView;
          if (this.mbi > i)
          {
            str = this.mbh.charAt(i);
            if (this.mbi == i + 1)
            {
              localFaceNumberItemView = this.mbk[i];
              if (localFaceNumberItemView.maW != null)
                localFaceNumberItemView.btK();
              localFaceNumberItemView.maW = new Timer("FaceNumberItemView_karaoke", true);
              FaceNumberItemView.a locala = new FaceNumberItemView.a(localFaceNumberItemView, localFaceNumberItemView.mbe, (byte)0);
              localFaceNumberItemView.maW.scheduleAtFixedRate(locala, 0L, FaceNumberItemView.maX);
            }
          }
          while (true)
          {
            a(this.mbk[i], str);
            i++;
            break;
            this.mbk[i].btK();
            localFaceNumberItemView = this.mbk[i];
            localFaceNumberItemView.mbd = 30;
            localFaceNumberItemView.invalidate();
            continue;
            str = "";
          }
        }
        AppMethodBeat.o(655);
      }
    while (true)
    {
      return;
      while (i < this.mbk.length)
      {
        a(this.mbk[i], "point");
        i++;
      }
      AppMethodBeat.o(655);
    }
  }

  private void btM()
  {
    AppMethodBeat.i(657);
    if (this.mbh != null)
    {
      this.mbi = this.mbh.length();
      AppMethodBeat.o(657);
    }
    while (true)
    {
      return;
      this.mbi = 0;
      AppMethodBeat.o(657);
    }
  }

  public final void Lw(String paramString)
  {
    AppMethodBeat.i(658);
    this.mbh = paramString;
    btM();
    btL();
    AppMethodBeat.o(658);
  }

  public void setNumberLengthAndInflate(int paramInt)
  {
    AppMethodBeat.i(653);
    if (paramInt > 12)
    {
      ab.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed max length: %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(653);
    }
    while (true)
    {
      return;
      if (paramInt <= 0)
      {
        ab.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed min length: %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(653);
      }
      else if (paramInt == this.mbl)
      {
        ab.i("MicroMsg.Facing.MMPwdInputView", "hy: already correct length. quit");
        Lw(null);
        AppMethodBeat.o(653);
      }
      else
      {
        this.mbj.removeAllViews();
        this.mbl = paramInt;
        this.mbk = new FaceNumberItemView[this.mbl];
        int i = 0;
        if (i < paramInt)
        {
          FaceNumberItemView localFaceNumberItemView = (FaceNumberItemView)inflate(getContext(), 2130969470, null);
          localFaceNumberItemView.setImageResource(2130838658);
          int j;
          int k;
          if (i == 0)
          {
            j = 3;
            k = (getResources().getDimensionPixelSize(2131428396) + a.fromDPToPix(getContext(), 48)) / 2;
          }
          while (true)
          {
            localFaceNumberItemView.setGravity(j);
            this.mbk[i] = localFaceNumberItemView;
            this.mbj.addView(localFaceNumberItemView, new ViewGroup.LayoutParams(k, getResources().getDimensionPixelSize(2131428394)));
            i++;
            break;
            if (i == paramInt - 1)
            {
              j = 5;
              k = (getResources().getDimensionPixelSize(2131428396) + a.fromDPToPix(getContext(), 48)) / 2;
            }
            else
            {
              j = 17;
              k = getResources().getDimensionPixelSize(2131428396);
            }
          }
        }
        AppMethodBeat.o(653);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceNumberView
 * JD-Core Version:    0.6.2
 */