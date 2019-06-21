package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.protobuf.crw;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  MMActivity crP;
  String fmB;
  private av gGg;
  TextView goa;
  String nAa;
  String nAb;
  String nAc;
  LinkedList<crw> nAd;
  long nAe;
  boolean nAf;
  private Runnable nAg;
  private al nAh;
  boolean nAi;
  private TextWatcher nAj;
  String nAk;
  b.a nzQ;
  private DialPad nzR;
  TextView nzS;
  EditText nzT;
  View nzU;
  private ImageButton nzV;
  View nzW;
  TextView nzX;
  TextView nzY;
  String nzZ;

  public b(MMActivity paramMMActivity, EditText paramEditText, TextView paramTextView1, View paramView1, DialPad paramDialPad, ImageButton paramImageButton, TextView paramTextView2, View paramView2, TextView paramTextView3, TextView paramTextView4)
  {
    AppMethodBeat.i(21980);
    this.nAb = "";
    this.nAe = 0L;
    this.nAf = false;
    this.nAg = new b.1(this);
    this.nAh = new al("IPCallDialQueryPhoneNumber");
    this.nAi = false;
    this.nAj = new b.2(this);
    this.nAk = "";
    this.crP = paramMMActivity;
    this.nzT = paramEditText;
    this.nzS = paramTextView1;
    this.nzU = paramView1;
    this.nzR = paramDialPad;
    this.nzV = paramImageButton;
    this.goa = paramTextView2;
    this.nzW = paramView2;
    this.nzX = paramTextView3;
    this.nzY = paramTextView4;
    this.gGg = new av();
    this.nAa = c.bIR();
    paramMMActivity = ah.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
    if (!bo.isNullOrNil(paramMMActivity));
    while (true)
    {
      this.nzZ = paramMMActivity;
      this.nzS.addTextChangedListener(this.nAj);
      this.nzS.setText("+" + this.nAa);
      this.nzR.setDialButtonClickListener(new b.3(this));
      this.nzU.setOnClickListener(new b.4(this));
      this.nzU.setOnLongClickListener(new b.5(this));
      this.nzS.setOnClickListener(new b.6(this));
      this.nzV.setOnClickListener(new b.7(this));
      this.nzT.setHorizontallyScrolling(true);
      this.nzT.setOnClickListener(new b.8(this));
      this.nzT.addTextChangedListener(new b.9(this));
      if (d.iW(16))
      {
        this.nzS.setTypeface(Typeface.create("sans-serif-light", 0));
        this.nzT.setTypeface(Typeface.create("sans-serif-light", 0));
        this.goa.setTypeface(Typeface.create("sans-serif-light", 0));
      }
      AppMethodBeat.o(21980);
      return;
      paramMMActivity = a.Pq(a.bIN());
    }
  }

  static String eL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(21983);
    paramString1 = av.formatNumber(paramString1, c.PA(paramString2));
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(21983);
      paramString1 = paramString2;
    }
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(21983);
    }
  }

  public final void OZ(String paramString)
  {
    AppMethodBeat.i(21981);
    this.nAa = paramString;
    if (this.nzS != null)
      this.nzS.setText("+".concat(String.valueOf(paramString)));
    AppMethodBeat.o(21981);
  }

  public final void ae(LinkedList<crw> paramLinkedList)
  {
    AppMethodBeat.i(21982);
    this.nAd = paramLinkedList;
    paramLinkedList = this.nzS.getText().toString().replace("+", "");
    if ((a.Pt(paramLinkedList)) && (this.nAd != null) && (this.nAd.size() > 0))
    {
      String str = a.Pr(paramLinkedList);
      paramLinkedList = this.nAd.iterator();
      crw localcrw;
      do
      {
        if (!paramLinkedList.hasNext())
          break;
        localcrw = (crw)paramLinkedList.next();
      }
      while ((localcrw == null) || (!localcrw.guW.equals(str)));
    }
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.nzY.setVisibility(0);
        AppMethodBeat.o(21982);
      }
      while (true)
      {
        return;
        this.nzY.setVisibility(8);
        AppMethodBeat.o(21982);
      }
    }
  }

  public final void bId()
  {
    AppMethodBeat.i(21985);
    this.nAh.doN().removeCallbacks(this.nAg);
    this.nAh.m(this.nAg, 500L);
    AppMethodBeat.o(21985);
  }

  public final void cq(String paramString, int paramInt)
  {
    AppMethodBeat.i(21984);
    this.nzT.setText(paramString);
    if (!bo.isNullOrNil(paramString))
    {
      if (paramInt == -1)
        break label73;
      if (this.nAi)
      {
        if ((paramInt <= 0) || (paramInt > this.nzT.getText().length()))
          break label73;
        this.nzT.setSelection(paramInt);
      }
    }
    while (true)
    {
      this.nAb = paramString;
      AppMethodBeat.o(21984);
      return;
      label73: this.nzT.setSelection(this.nzT.getText().length());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b
 * JD-Core Version:    0.6.2
 */