package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bp;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.widget.MMEditText;

public class EditSignatureUI extends MMActivity
{
  private p eir;
  private com.tencent.mm.sdk.b.c ekk;
  private MMEditText qkH;
  private j.b qkI;
  final bp qkJ;
  private boolean qkK;
  private TextView qkx;

  public EditSignatureUI()
  {
    AppMethodBeat.i(126949);
    this.eir = null;
    this.qkJ = bp.aao();
    this.qkK = false;
    this.ekk = new EditSignatureUI.1(this);
    AppMethodBeat.o(126949);
  }

  public final int getLayoutId()
  {
    return 2130969318;
  }

  public final void initView()
  {
    AppMethodBeat.i(126952);
    setMMTitle(2131303259);
    this.qkH = ((MMEditText)findViewById(2131821019));
    this.qkx = ((TextView)findViewById(2131823129));
    String str = bo.nullAsNil((String)g.RP().Ry().get(12291, null));
    this.qkH.setText(j.b(this, str, this.qkH.getTextSize()));
    this.qkH.setSelection(this.qkH.getText().length());
    this.qkx.setText(f.bP(60, this.qkH.getEditableText().toString()));
    com.tencent.mm.ui.tools.b.c.d(this.qkH).hz(0, 60).a(null);
    this.qkH.addTextChangedListener(new a((byte)0));
    setBackBtn(new EditSignatureUI.2(this));
    a(0, getString(2131297038), new EditSignatureUI.3(this), q.b.ymu);
    enableOptionMenu(false);
    AppMethodBeat.o(126952);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126950);
    super.onCreate(paramBundle);
    a.xxA.c(this.ekk);
    initView();
    AppMethodBeat.o(126950);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(126951);
    super.onDestroy();
    a.xxA.d(this.ekk);
    AppMethodBeat.o(126951);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(126953);
    if (paramInt == 4)
      finish();
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(126953);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a
    implements TextWatcher
  {
    private int qkM = 60;

    private a()
    {
    }

    public final void afterTextChanged(Editable paramEditable)
    {
      AppMethodBeat.i(126948);
      this.qkM = f.bP(60, paramEditable.toString());
      if (this.qkM < 0)
        this.qkM = 0;
      if (EditSignatureUI.e(EditSignatureUI.this) != null)
        EditSignatureUI.e(EditSignatureUI.this).setText(this.qkM);
      AppMethodBeat.o(126948);
    }

    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(126947);
      EditSignatureUI.this.enableOptionMenu(true);
      AppMethodBeat.o(126947);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI
 * JD-Core Version:    0.6.2
 */