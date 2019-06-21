package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public class MMAutoSwitchEditTextView extends LinearLayout
{
  private int iYI;
  private Context mContext;
  private int mScreenWidth;
  private int nJg;
  private int pNN;
  private int ytO;
  private String ytP;
  private ArrayList<MMAutoSwitchEditText> ytQ;
  private MMAutoSwitchEditTextView.c ytR;
  private MMAutoSwitchEditTextView.a ytS;
  private MMAutoSwitchEditTextView.b ytT;

  public MMAutoSwitchEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106502);
    this.ytQ = new ArrayList();
    this.ytR = new MMAutoSwitchEditTextView.c(this, (byte)0);
    this.iYI = 100;
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.AutoSwitchLayout);
    this.ytO = paramAttributeSet.getInteger(0, 3);
    this.nJg = paramAttributeSet.getInteger(1, 4);
    this.pNN = paramAttributeSet.getInteger(2, 2);
    int i = paramAttributeSet.getResourceId(3, 0);
    if (i != 0)
      this.ytP = paramContext.getString(i);
    paramAttributeSet.recycle();
    if ((paramContext instanceof Activity))
    {
      this.mScreenWidth = ((Activity)paramContext).getWindowManager().getDefaultDisplay().getWidth();
      this.iYI = ((this.mScreenWidth - 80 - (this.ytO - 1) * 20) / this.ytO);
    }
    setPadding(a.fromDPToPix(paramContext, 20), 0, a.fromDPToPix(paramContext, 20), 0);
    bKZ();
    AppMethodBeat.o(106502);
  }

  private void bKZ()
  {
    AppMethodBeat.i(106503);
    int i = 0;
    if (i < this.ytO)
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)View.inflate(this.mContext, 2130968790, null);
      localMMAutoSwitchEditText.setInputType(this.pNN);
      if ((this.ytP != null) && (this.ytP.length() > 0))
        localMMAutoSwitchEditText.setKeyListener(DigitsKeyListener.getInstance(this.ytP));
      localMMAutoSwitchEditText.ytJ.mIndex = i;
      int j = this.nJg;
      localMMAutoSwitchEditText.ytJ.ytN = j;
      Object localObject = this.ytR;
      localMMAutoSwitchEditText.ytJ.ytK = ((MMAutoSwitchEditText.c)localObject);
      localObject = this.ytR;
      localMMAutoSwitchEditText.ytJ.ytL = ((MMAutoSwitchEditText.b)localObject);
      localObject = this.ytR;
      localMMAutoSwitchEditText.ytJ.ytM = ((MMAutoSwitchEditText.d)localObject);
      localObject = new LinearLayout.LayoutParams(this.iYI, -2);
      if (i > 0);
      for (((LinearLayout.LayoutParams)localObject).leftMargin = 20; ; ((LinearLayout.LayoutParams)localObject).leftMargin = 0)
      {
        ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
        localMMAutoSwitchEditText.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.ytQ.add(localMMAutoSwitchEditText);
        addView(localMMAutoSwitchEditText);
        i++;
        break;
      }
    }
    AppMethodBeat.o(106503);
  }

  public String getText()
  {
    AppMethodBeat.i(106501);
    String str = "";
    Iterator localIterator = this.ytQ.iterator();
    if (localIterator.hasNext())
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
      if (bo.isNullOrNil(localMMAutoSwitchEditText.getText().toString().trim()))
        break label89;
      str = str + localMMAutoSwitchEditText.getText().toString().trim();
    }
    label89: 
    while (true)
    {
      break;
      AppMethodBeat.o(106501);
      return str;
    }
  }

  public void setOnInputFinished(MMAutoSwitchEditTextView.a parama)
  {
    this.ytS = parama;
  }

  public void setOnTextChanged(MMAutoSwitchEditTextView.b paramb)
  {
    this.ytT = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditTextView
 * JD-Core Version:    0.6.2
 */