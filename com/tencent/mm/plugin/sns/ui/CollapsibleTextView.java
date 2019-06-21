package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.v;
import java.util.HashMap;

public class CollapsibleTextView extends LinearLayout
{
  private String cFc;
  private Context context;
  private String czD;
  private ak handler;
  private boolean hasCheck;
  private boolean qFG;
  private int rgX;
  protected SnsPostDescPreloadTextView rhR;
  protected SnsTextView rhS;
  protected TextView rhT;
  private String rhU;
  private String rhV;
  private HashMap<String, Integer> rhW;
  protected av rhX;
  private Runnable rhY;
  private CharSequence text;

  public CollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38200);
    this.qFG = false;
    this.hasCheck = true;
    this.handler = new ak(Looper.getMainLooper());
    this.rgX = 0;
    this.rhY = new CollapsibleTextView.1(this);
    this.context = paramContext;
    this.rhU = this.context.getString(2131303617);
    this.rhV = this.context.getString(2131303616);
    paramContext = v.hu(this.context).inflate(2130969149, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.rhR = ((SnsPostDescPreloadTextView)paramContext.findViewById(2131820991));
    this.rhT = ((TextView)paramContext.findViewById(2131822813));
    this.rhS = ((SnsTextView)paramContext.findViewById(2131822812));
    AppMethodBeat.o(38200);
  }

  public final void a(int paramInt, CharSequence paramCharSequence, TextView.BufferType paramBufferType, HashMap<String, Integer> paramHashMap, String paramString1, String paramString2, au paramau, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(38201);
    this.context = paramau.crP;
    this.rhW = paramHashMap;
    this.text = paramCharSequence;
    this.qFG = paramBoolean;
    this.czD = paramString1;
    this.cFc = paramString2;
    this.rgX = paramInt;
    this.rhU = this.context.getString(2131303617);
    this.rhV = this.context.getString(2131303616);
    this.rhS.setOriginText(paramString3);
    paramString2 = new ar(this.cFc, this.czD, false, false, 1);
    paramString2.userName = this.rhX.igi;
    if (paramInt == 0)
    {
      this.rhR.setText(paramString3);
      this.rhS.setVisibility(8);
      this.rhT.setVisibility(0);
      this.rhR.setVisibility(0);
      paramCharSequence = new m(this.context);
      this.rhR.setOnTouchListener(paramCharSequence);
      this.rhR.setTag(paramString2);
      if (paramHashMap.get(paramString1) == null)
      {
        this.hasCheck = false;
        this.rhT.setVisibility(8);
        this.rhR.setMaxLines(8);
        AppMethodBeat.o(38201);
      }
    }
    while (true)
    {
      return;
      this.hasCheck = true;
      switch (((Integer)paramHashMap.get(paramString1)).intValue())
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(38201);
        break;
        this.rhT.setVisibility(8);
        AppMethodBeat.o(38201);
        break;
        this.rhR.setMaxLines(6);
        this.rhT.setVisibility(0);
        this.rhT.setText(this.rhU);
        AppMethodBeat.o(38201);
        break;
        this.rhR.setMaxLines(2147483647);
        this.rhT.setVisibility(0);
        this.rhT.setText(this.rhV);
      }
      this.rhS.setText(paramCharSequence, paramBufferType);
      this.rhS.setTag(paramString2);
      this.rhS.setVisibility(0);
      this.rhT.setVisibility(8);
      this.rhR.setVisibility(8);
      this.rhS.setOnClickListener(paramau.qOL.rKc);
      AppMethodBeat.o(38201);
    }
  }

  public int getSpreadHeight()
  {
    AppMethodBeat.i(38202);
    ab.i("MicroMsg.CollapsibleTextView", "count:" + this.rhR.getLineCount() + "  height:" + this.rhR.getLineHeight());
    int i = this.rhR.getLineCount();
    int j = this.rhR.getLineHeight();
    AppMethodBeat.o(38202);
    return (i - 7) * j;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38206);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.rgX == 0) && (!this.qFG))
      if (this.hasCheck)
        AppMethodBeat.o(38206);
    while (true)
    {
      return;
      this.hasCheck = true;
      if (this.rhR.getLineCount() <= 7)
      {
        this.rhW.put(this.czD, Integer.valueOf(0));
        AppMethodBeat.o(38206);
      }
      else
      {
        this.rhW.put(this.czD, Integer.valueOf(1));
        this.handler.post(this.rhY);
        AppMethodBeat.o(38206);
      }
    }
  }

  public void setClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(38205);
    this.rhT.setClickable(paramBoolean);
    this.rhS.setClickable(paramBoolean);
    this.rhR.setClickable(paramBoolean);
    super.setClickable(paramBoolean);
    AppMethodBeat.o(38205);
  }

  public void setLongClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(38204);
    this.rhT.setLongClickable(paramBoolean);
    this.rhS.setLongClickable(paramBoolean);
    this.rhR.setLongClickable(paramBoolean);
    super.setLongClickable(paramBoolean);
    AppMethodBeat.o(38204);
  }

  public void setOpClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(38203);
    if (this.rhT != null)
      this.rhT.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(38203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.CollapsibleTextView
 * JD-Core Version:    0.6.2
 */