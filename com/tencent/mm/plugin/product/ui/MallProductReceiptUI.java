package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.protocal.protobuf.bpz;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class MallProductReceiptUI extends MallBaseUI
{
  private c piK;
  private d pja = null;
  private AutoCompleteTextView pjb = null;
  private h pjc = null;

  public final int getLayoutId()
  {
    return 2130970393;
  }

  public final void initView()
  {
    AppMethodBeat.i(44094);
    setMMTitle(2131301354);
    addTextOptionMenu(0, getString(2131296944), new MallProductReceiptUI.1(this));
    this.pjb = ((AutoCompleteTextView)findViewById(2131826602));
    bpz localbpz = this.piK.bZK();
    if ((localbpz != null) && (!bo.isNullOrNil(localbpz.naq)))
      this.pjb.setText(localbpz.naq);
    this.pjb.setSelection(this.pjb.getText().length());
    this.pjc = new h(this);
    this.pjb.setAdapter(this.pjc);
    this.pjb.setOnItemClickListener(new MallProductReceiptUI.2(this));
    View.inflate(this.mController.ylL, 2130970389, null).setOnClickListener(new MallProductReceiptUI.3(this));
    AppMethodBeat.o(44094);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44093);
    super.onCreate(paramBundle);
    this.pja = a.bZC().bZE();
    a.bZC();
    this.piK = a.bZD();
    initView();
    AppMethodBeat.o(44093);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductReceiptUI
 * JD-Core Version:    0.6.2
 */