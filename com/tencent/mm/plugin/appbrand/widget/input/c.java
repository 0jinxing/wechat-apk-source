package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.h;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.tools.f.a;
import java.lang.ref.WeakReference;

public abstract class c<Input extends EditText,  extends ab> extends com.tencent.mm.ui.widget.g
  implements aa
{
  public af jdi;
  public ae jdj;
  public final int jdk;
  final String jdl;
  public final WeakReference<u> jdm;
  public final View.OnFocusChangeListener jdn = new View.OnFocusChangeListener()
  {
    public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
    {
      AppMethodBeat.i(123577);
      c.this.fb(paramAnonymousBoolean);
      if (paramAnonymousBoolean)
      {
        o.a((u)c.this.jdm.get(), (ab)c.this.aQl());
        ((ab)c.this.aQl()).setInputId(c.this.jdk);
        o.b((u)c.this.jdm.get(), c.this);
      }
      AppMethodBeat.o(123577);
    }
  };
  private final c.a jdo = new c.2(this);

  c(String paramString, u paramu, int paramInt)
  {
    this.jdl = paramString;
    this.jdm = new WeakReference(paramu);
    this.jdk = paramInt;
  }

  private void b(Editable paramEditable)
  {
    af localaf;
    if (this.jdi != null)
    {
      localaf = this.jdi;
      if (paramEditable != null)
        break label34;
    }
    label34: for (String str = ""; ; str = paramEditable.toString())
    {
      localaf.a(str, Selection.getSelectionEnd(paramEditable), af.a.jgE);
      return;
    }
  }

  public abstract boolean EG(String paramString);

  final void a(Editable paramEditable)
  {
    af localaf;
    if (this.jdi != null)
    {
      localaf = this.jdi;
      if (paramEditable != null)
        break label34;
    }
    label34: for (String str = ""; ; str = paramEditable.toString())
    {
      localaf.a(str, Selection.getSelectionEnd(paramEditable), af.a.jgC);
      return;
    }
  }

  public final void a(String paramString, Integer paramInteger)
  {
    EG(paramString);
    if (paramInteger == null);
    for (int i = -1; ; i = paramInteger.intValue())
    {
      paramString = Integer.valueOf(i);
      dq(paramString.intValue(), paramString.intValue());
      return;
    }
  }

  public final boolean a(h paramh)
  {
    boolean bool = false;
    paramh = b(paramh);
    if (paramh == null);
    label101: 
    while (true)
    {
      return bool;
      if (paramh.jjy == null)
        paramh.jjy = Integer.valueOf(140);
      while (true)
      {
        if (aQl() == null)
          break label101;
        paramh = p.a(aQl()).PM(paramh.jjy.intValue());
        paramh.zIx = false;
        paramh.jeZ = f.a.zFu;
        paramh.a(this.jdo);
        bool = true;
        break;
        if (paramh.jjy.intValue() <= 0)
          paramh.jjy = Integer.valueOf(2147483647);
      }
    }
  }

  public abstract Input aQl();

  public abstract Rect aQm();

  public final boolean aQn()
  {
    return aQp();
  }

  public final Input aQo()
  {
    return aQl();
  }

  public final boolean aQp()
  {
    EditText localEditText = aQl();
    boolean bool;
    if (localEditText == null)
      bool = false;
    while (true)
    {
      return bool;
      ((ab)localEditText).b(this.jdn);
      localEditText.removeTextChangedListener(this);
      ((ab)localEditText).destroy();
      Object localObject = (u)this.jdm.get();
      if (localObject == null)
      {
        bool = false;
      }
      else
      {
        localObject = (g)((u)localObject).aAY();
        if (localObject == null)
        {
          bool = false;
        }
        else
        {
          ((g)localObject).cF(localEditText);
          bool = true;
        }
      }
    }
  }

  public final Editable aQq()
  {
    if (aQl() == null);
    for (Editable localEditable = null; ; localEditable = aQl().getEditableText())
      return localEditable;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    b(paramEditable);
  }

  protected abstract h b(h paramh);

  protected final void dq(int paramInt1, int paramInt2)
  {
    b.a(aQl(), paramInt1, paramInt2);
  }

  protected abstract boolean fb(boolean paramBoolean);

  public final int getInputId()
  {
    return this.jdk;
  }

  public final void qx(int paramInt)
  {
    if (this.jdj != null)
      this.jdj.qz(paramInt);
  }

  public final boolean s(u paramu)
  {
    if ((paramu != null) && (paramu == this.jdm.get()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.c
 * JD-Core Version:    0.6.2
 */