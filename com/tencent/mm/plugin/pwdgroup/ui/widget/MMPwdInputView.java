package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMPwdInputView extends LinearLayout
{
  public StringBuilder enD;
  public int mbi;
  private ImageView psA;
  private a psB;
  private b psC;
  private boolean psw;
  private ImageView psx;
  private ImageView psy;
  private ImageView psz;

  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MMPwdInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(24056);
    this.enD = new StringBuilder();
    this.psw = false;
    this.psC = b.psE;
    paramContext = inflate(getContext(), 2130970418, null);
    this.psx = ((ImageView)paramContext.findViewById(2131826671));
    this.psy = ((ImageView)paramContext.findViewById(2131826672));
    this.psz = ((ImageView)paramContext.findViewById(2131826673));
    this.psA = ((ImageView)paramContext.findViewById(2131826674));
    this.psx.setImageResource(2130837815);
    this.psy.setImageResource(2130837815);
    this.psz.setImageResource(2130837815);
    this.psA.setImageResource(2130837815);
    addView(paramContext);
    AppMethodBeat.o(24056);
  }

  private static void q(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(24059);
    if (paramImageView == null)
      AppMethodBeat.o(24059);
    while (true)
    {
      return;
      if (paramString.equals("0"))
      {
        paramImageView.setImageResource(2130837805);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("1"))
      {
        paramImageView.setImageResource(2130837806);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("2"))
      {
        paramImageView.setImageResource(2130837807);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("3"))
      {
        paramImageView.setImageResource(2130837808);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("4"))
      {
        paramImageView.setImageResource(2130837809);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("5"))
      {
        paramImageView.setImageResource(2130837810);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("6"))
      {
        paramImageView.setImageResource(2130837811);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("7"))
      {
        paramImageView.setImageResource(2130837812);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("8"))
      {
        paramImageView.setImageResource(2130837813);
        AppMethodBeat.o(24059);
      }
      else if (paramString.equals("9"))
      {
        paramImageView.setImageResource(2130837814);
        AppMethodBeat.o(24059);
      }
      else
      {
        paramImageView.setImageResource(2130837815);
        AppMethodBeat.o(24059);
      }
    }
  }

  public final void axQ()
  {
    AppMethodBeat.i(24061);
    if (this.mbi > 0)
      this.enD.delete(0, this.mbi);
    btM();
    cbX();
    AppMethodBeat.o(24061);
  }

  public final void btM()
  {
    AppMethodBeat.i(24060);
    if (this.enD != null)
    {
      this.mbi = this.enD.length();
      if (this.mbi < 4)
        break label79;
    }
    label79: for (this.psw = true; ; this.psw = false)
    {
      if (this.psB != null)
        this.psB.o(this.psw, this.enD.toString());
      AppMethodBeat.o(24060);
      return;
      this.mbi = 0;
      break;
    }
  }

  public final void cbX()
  {
    AppMethodBeat.i(24058);
    int i = 0;
    if (i < 4)
    {
      String str;
      if (this.mbi > i)
      {
        str = this.enD.toString().charAt(i);
        label46: switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      while (true)
      {
        i++;
        break;
        str = "";
        break label46;
        q(this.psx, str);
        continue;
        q(this.psy, str);
        continue;
        q(this.psz, str);
        continue;
        q(this.psA, str);
      }
    }
    AppMethodBeat.o(24058);
  }

  public final void input(String paramString)
  {
    AppMethodBeat.i(24062);
    if ((TextUtils.isEmpty(paramString)) || (this.psw))
      AppMethodBeat.o(24062);
    while (true)
    {
      return;
      this.enD.append(paramString);
      btM();
      cbX();
      AppMethodBeat.o(24062);
    }
  }

  public void setNumberStyle(b paramb)
  {
    this.psC = paramb;
  }

  public void setNumberWidth(int paramInt)
  {
    AppMethodBeat.i(24057);
    if (this.psx != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.psx.getLayoutParams();
      localLayoutParams.width = paramInt;
      this.psx.setLayoutParams(localLayoutParams);
      this.psy.setLayoutParams(localLayoutParams);
      this.psz.setLayoutParams(localLayoutParams);
      this.psA.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(24057);
  }

  public void setOnFinishInputListener(a parama)
  {
    this.psB = parama;
  }

  public static abstract interface a
  {
    public abstract void o(boolean paramBoolean, String paramString);
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(24055);
      psD = new b("Normal", 0);
      psE = new b("Shine", 1);
      psF = new b[] { psD, psE };
      AppMethodBeat.o(24055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView
 * JD-Core Version:    0.6.2
 */