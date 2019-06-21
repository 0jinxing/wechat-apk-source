package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class LoaddingView extends LinearLayout
  implements c
{
  private Animation De;
  private TextView nLs;
  private ProgressBar nLt;
  private View nLu;
  private boolean nLv;
  private String nLw;

  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113426);
    this.nLv = false;
    this.nLw = "";
    init(paramContext);
    AppMethodBeat.o(113426);
  }

  @TargetApi(11)
  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113425);
    this.nLv = false;
    this.nLw = "";
    init(paramContext);
    AppMethodBeat.o(113425);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(113427);
    this.De = AnimationUtils.loadAnimation(paramContext, 2131034283);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969947, this, true);
    this.nLt = ((ProgressBar)paramContext.findViewById(2131825275));
    this.nLs = ((TextView)paramContext.findViewById(2131825276));
    this.nLu = paramContext.findViewById(2131825273);
    this.nLs.setText("");
    this.nLs.setVisibility(0);
    this.nLt.setVisibility(0);
    AppMethodBeat.o(113427);
  }

  public String getPreText()
  {
    return this.nLw;
  }

  public void setPreText(String paramString)
  {
    AppMethodBeat.i(113430);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(113430);
    while (true)
    {
      return;
      this.nLw = (paramString + "\n");
      AppMethodBeat.o(113430);
    }
  }

  public void setProgressAlwaysGone(boolean paramBoolean)
  {
    AppMethodBeat.i(113428);
    this.nLv = paramBoolean;
    this.nLt.setVisibility(8);
    this.nLs.setVisibility(8);
    AppMethodBeat.o(113428);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(113429);
    if ((this.nLs == null) || (this.nLt == null) || (this.nLv))
      AppMethodBeat.o(113429);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramString))
      {
        this.nLs.setText(String.valueOf(paramString));
        this.nLt.setVisibility(8);
        this.nLs.setVisibility(0);
        AppMethodBeat.o(113429);
      }
      else
      {
        this.nLs.setText("");
        this.nLs.setVisibility(0);
        this.nLt.setVisibility(0);
        AppMethodBeat.o(113429);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LoaddingView
 * JD-Core Version:    0.6.2
 */