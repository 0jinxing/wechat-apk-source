package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.ab;
import com.tencent.mm.plugin.appbrand.widget.input.d.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class b
{
  final ab jhB;
  public final e jhC;
  private final Filter.FilterListener jhD;
  public final c jhE;
  private final b.a jhF;
  private f jhG;
  public a jhH;
  private int jhI;
  private int jhJ;

  public b(ab paramab)
  {
    AppMethodBeat.i(123890);
    this.jhG = f.jid;
    this.jhB = paramab;
    this.jhC = new e(paramab.getContext());
    this.jhE = new c(paramab, this.jhC);
    this.jhB.a(new b.1(this));
    this.jhB.a(new b.2(this));
    this.jhB.a(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(123883);
        if (paramAnonymousBoolean)
        {
          b.this.aRw();
          AppMethodBeat.o(123883);
        }
        while (true)
        {
          return;
          b localb = b.this;
          if (localb.jhC.amH.isShowing())
          {
            paramAnonymousView = (g)localb.jhC.jhV.getAdapter();
            localb.jhC.dismiss();
            paramAnonymousView.aRu();
          }
          AppMethodBeat.o(123883);
        }
      }
    });
    this.jhB.addTextChangedListener(new TextWatcher()
    {
      private boolean jhL = false;

      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        AppMethodBeat.i(123885);
        if ((this.jhL) && (!b.this.jhC.amH.isShowing()))
          AppMethodBeat.o(123885);
        while (true)
        {
          return;
          if (!b.this.jhC.amH.isShowing())
            b.this.aRw();
          b.this.E(paramAnonymousEditable);
          AppMethodBeat.o(123885);
        }
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(123884);
        this.jhL = b.this.jhC.amH.isShowing();
        AppMethodBeat.o(123884);
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.jhD = new b.5(this);
    this.jhF = new b.6(this);
    AppMethodBeat.o(123890);
  }

  final void E(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(123891);
    if (this.jhH == null)
      AppMethodBeat.o(123891);
    while (true)
    {
      return;
      this.jhH.getFilter().filter(paramCharSequence, this.jhD);
      AppMethodBeat.o(123891);
    }
  }

  final void a(f paramf)
  {
    AppMethodBeat.i(123895);
    if (paramf != null)
      this.jhG = paramf;
    aRv();
    AppMethodBeat.o(123895);
  }

  final void a(h paramh)
  {
    this.jhF.jhN = paramh;
  }

  final void aRv()
  {
    AppMethodBeat.i(123893);
    switch (b.7.jhM[this.jhG.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      if (this.jhI != 0)
      {
        this.jhC.amm = this.jhI;
        this.jhC.age -= this.jhI;
      }
      if (this.jhJ != 0)
        this.jhC.age -= this.jhJ;
      AppMethodBeat.o(123893);
      return;
      this.jhC.age = com.tencent.mm.plugin.appbrand.ui.n.aMw()[0];
      continue;
      this.jhC.age = this.jhB.getView().getMeasuredWidth();
    }
  }

  final void aRw()
  {
    AppMethodBeat.i(123896);
    if (this.jhH == null)
      AppMethodBeat.o(123896);
    while (true)
    {
      return;
      Object localObject = this.jhB.getText();
      if (!bo.ac((CharSequence)localObject))
        E((CharSequence)localObject);
      this.jhC.amx = this.jhB.getView();
      this.jhC.show();
      ((g)this.jhC.jhV.getAdapter()).a(this);
      c localc = this.jhE;
      localc.qM(2);
      localc.jhQ = -2147483648;
      if (!bo.ac((CharSequence)localObject))
        localc.jhR = true;
      localObject = localc.jhC.jhV;
      if (localObject != null)
        ((ListView)localObject).getAdapter().registerDataSetObserver(new c.2(localc));
      AppMethodBeat.o(123896);
    }
  }

  final void s(ArrayList<a.b> paramArrayList)
  {
    AppMethodBeat.i(123892);
    this.jhH = new a(this.jhB.getContext(), paramArrayList);
    this.jhH.jhu = this.jhF;
    e locale = this.jhC;
    paramArrayList = this.jhH;
    if (locale.mObserver == null)
      locale.mObserver = new AutoFillListPopupWindowBase.c(locale, (byte)0);
    while (true)
    {
      locale.Ei = paramArrayList;
      if (locale.Ei != null)
        paramArrayList.registerDataSetObserver(locale.mObserver);
      if (locale.jhV != null)
        locale.jhV.setAdapter(locale.Ei);
      AppMethodBeat.o(123892);
      return;
      if (locale.Ei != null)
        locale.Ei.unregisterDataSetObserver(locale.mObserver);
    }
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(123894);
    this.jhC.setOnDismissListener(paramOnDismissListener);
    AppMethodBeat.o(123894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.b
 * JD-Core Version:    0.6.2
 */