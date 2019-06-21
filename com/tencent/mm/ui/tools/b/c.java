package com.tencent.mm.ui.tools.b;

import android.text.InputFilter;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.tools.f.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c extends a
{
  public f.a jeZ;
  private String mText;
  private int zIA;
  private ArrayList<InputFilter> zIB;
  public a zIC;
  public boolean zIx = true;
  public WeakReference<EditText> zIy;
  private int zIz;

  public c(String paramString)
  {
    this.mText = paramString;
    this.jeZ = f.a.zFv;
    this.zIx = false;
  }

  public c(WeakReference<EditText> paramWeakReference)
  {
    this.zIy = paramWeakReference;
    this.jeZ = f.a.zFv;
    this.zIx = false;
  }

  public static c d(EditText paramEditText)
  {
    AppMethodBeat.i(67866);
    paramEditText = new c(new WeakReference(paramEditText));
    AppMethodBeat.o(67866);
    return paramEditText;
  }

  public final c PM(int paramInt)
  {
    this.zIA = 0;
    this.zIz = paramInt;
    return this;
  }

  protected f a(int paramInt, f.a parama)
  {
    AppMethodBeat.i(67870);
    parama = new f(paramInt, parama);
    AppMethodBeat.o(67870);
    return parama;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(67867);
    this.zIC = parama;
    dkS();
    AppMethodBeat.o(67867);
  }

  protected final int aAa()
  {
    AppMethodBeat.i(67868);
    int i;
    if (bo.isNullOrNil(this.mText))
      if (this.zIy == null)
      {
        AppMethodBeat.o(67868);
        i = 1;
      }
    while (true)
    {
      return i;
      this.mText = ((EditText)this.zIy.get()).getText().toString().trim();
      int j = f.a(this.mText, this.jeZ);
      if (j < 0);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label98;
        ab.w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
        AppMethodBeat.o(67868);
        i = 2;
        break;
      }
      label98: if (j < this.zIA)
      {
        AppMethodBeat.o(67868);
        i = 1;
      }
      else if (j > this.zIz)
      {
        AppMethodBeat.o(67868);
        i = 2;
      }
      else
      {
        AppMethodBeat.o(67868);
        i = 0;
      }
    }
  }

  protected final void dkS()
  {
    AppMethodBeat.i(67869);
    Object localObject;
    if (!this.zIx)
    {
      if (this.zIy == null)
      {
        ab.w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
        AppMethodBeat.o(67869);
        return;
      }
      if (bo.ek(this.zIB))
      {
        localObject = a(this.zIz, this.jeZ);
        ((EditText)this.zIy.get()).setFilters(new InputFilter[] { localObject });
      }
    }
    else
    {
      label76: if (this.zIC != null)
        switch (aAa())
        {
        default:
        case 0:
        case 1:
        case 2:
        }
    }
    while (true)
    {
      AppMethodBeat.o(67869);
      break;
      this.zIB.add(a(this.zIz, this.jeZ));
      localObject = (InputFilter[])this.zIB.toArray(new InputFilter[this.zIB.size()]);
      ((EditText)this.zIy.get()).setFilters((InputFilter[])localObject);
      break label76;
      this.zIC.ki(this.mText);
      AppMethodBeat.o(67869);
      break;
      this.zIC.JW();
      AppMethodBeat.o(67869);
      break;
      this.zIC.JX();
    }
  }

  public final c hz(int paramInt1, int paramInt2)
  {
    this.zIA = paramInt1;
    this.zIz = paramInt2;
    return this;
  }

  public static abstract interface a
  {
    public abstract void JW();

    public abstract void JX();

    public abstract void ki(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.b.c
 * JD-Core Version:    0.6.2
 */