package com.tencent.mm.plugin.sight.encode.ui;

import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements TextWatcher, View.OnClickListener, View.OnFocusChangeListener, com.tencent.mm.plugin.fts.a.l
{
  private ak handler;
  public EditText qAV;
  public TextView qAW;
  public View qAX;
  private a qAY;
  InputMethodManager qAZ;
  public d.b qBa;
  public d.a qBb;

  public d()
  {
    AppMethodBeat.i(25075);
    this.qBa = d.b.qBd;
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(25075);
  }

  private void clM()
  {
    AppMethodBeat.i(25079);
    if (clK())
      AppMethodBeat.o(25079);
    while (true)
    {
      return;
      this.qBa = d.b.qBc;
      this.qAX.setVisibility(0);
      if (this.qBb != null)
        this.qBb.clO();
      this.qAV.requestFocus();
      this.qAZ.showSoftInput(this.qAV, 0);
      AppMethodBeat.o(25079);
    }
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(25082);
    if (bo.isNullOrNil(paramEditable.toString()))
      AppMethodBeat.o(25082);
    while (true)
    {
      return;
      String str = paramEditable.toString();
      ab.i("MicroMsg.MainSightSelectContactSearchHelper", "doSearch: query=%s", new Object[] { str });
      if (this.qAY != null)
      {
        ((n)g.M(n.class)).cancelSearchTask(this.qAY);
        this.qAY = null;
      }
      paramEditable = new HashSet();
      b localb = b.mEV;
      ak localak = this.handler;
      paramEditable = i.a(str, new int[] { 131072, 131075 }, null, 3, paramEditable, localb, this, localak);
      this.qAY = ((n)g.M(n.class)).search(2, paramEditable);
      AppMethodBeat.o(25082);
    }
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(25081);
    if (paramj.bFZ == 0)
      if ((paramj.mEy == null) || (this.qBb == null))
        AppMethodBeat.o(25081);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      paramj = paramj.mEy.iterator();
      while (paramj.hasNext())
        localArrayList.add(((com.tencent.mm.plugin.fts.a.a.l)paramj.next()).mDx);
      this.qBb.db(localArrayList);
      AppMethodBeat.o(25081);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final boolean clK()
  {
    if (this.qBa == d.b.qBc);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void clL()
  {
    AppMethodBeat.i(25078);
    if (clK())
    {
      clN();
      AppMethodBeat.o(25078);
    }
    while (true)
    {
      return;
      clM();
      AppMethodBeat.o(25078);
    }
  }

  public final void clN()
  {
    AppMethodBeat.i(25080);
    if (!clK())
      AppMethodBeat.o(25080);
    while (true)
    {
      return;
      this.qAV.setText("");
      this.qAV.clearFocus();
      bo.hideVKB(this.qAV);
      this.qBa = d.b.qBd;
      this.qAX.setVisibility(8);
      if (this.qBb != null)
        this.qBb.clP();
      AppMethodBeat.o(25080);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25077);
    if (paramView.getId() == 2131825724)
      if (!clK())
        AppMethodBeat.o(25077);
    while (true)
    {
      return;
      clL();
      AppMethodBeat.o(25077);
    }
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(25076);
    if (!paramBoolean)
    {
      this.qAV.clearFocus();
      bo.hideVKB(this.qAV);
    }
    AppMethodBeat.o(25076);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.d
 * JD-Core Version:    0.6.2
 */