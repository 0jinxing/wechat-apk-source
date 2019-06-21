package com.tencent.mm.plugin.recharge.ui.form;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  private static String TAG = "MicroMsg.CommonHintViewConfig";

  public static void b(MallFormView paramMallFormView)
  {
    AppMethodBeat.i(44374);
    if (paramMallFormView == null)
    {
      ab.e(TAG, "hy: param error");
      AppMethodBeat.o(44374);
    }
    while (true)
    {
      return;
      paramMallFormView.setLogicDelegate(new c.1());
      AppMethodBeat.o(44374);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.c
 * JD-Core Version:    0.6.2
 */