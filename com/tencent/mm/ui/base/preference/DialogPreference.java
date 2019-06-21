package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;

public final class DialogPreference extends Preference
{
  private com.tencent.mm.ui.widget.a.c gud;
  public Preference.a yBv;
  private final d yBx;
  DialogPreference.a yBy;

  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107155);
    this.yBx = new d(paramContext);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ChoicePreference, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(0, -1);
    if (paramInt != -1)
      this.yBx.yBt = paramContext.getResources().getStringArray(paramInt);
    this.yBx.yBu = paramAttributeSet.getTextArray(1);
    paramAttributeSet.recycle();
    this.yBx.dAw();
    AppMethodBeat.o(107155);
  }

  public final void a(Preference.a parama)
  {
    this.yBv = parama;
  }

  public final String getValue()
  {
    return this.yBx.value;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(107157);
    c localc = (c)this.yBx.values.get(this.yBx.value);
    if (localc != null)
      setSummary(localc.text);
    super.onBindView(paramView);
    AppMethodBeat.o(107157);
  }

  public final void setValue(String paramString)
  {
    AppMethodBeat.i(107156);
    this.yBx.value = paramString;
    paramString = (c)this.yBx.values.get(paramString);
    if (paramString == null)
    {
      this.yBx.piC = -1;
      AppMethodBeat.o(107156);
    }
    while (true)
    {
      return;
      this.yBx.piC = paramString.id;
      AppMethodBeat.o(107156);
    }
  }

  protected final void showDialog()
  {
    AppMethodBeat.i(107158);
    ListViewInScrollView localListViewInScrollView = (ListViewInScrollView)View.inflate(this.mContext, 2130970120, null);
    localListViewInScrollView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(107154);
        if (DialogPreference.a(DialogPreference.this) != null)
          DialogPreference.a(DialogPreference.this).dismiss();
        DialogPreference.this.setValue((String)DialogPreference.b(DialogPreference.this).yBu[paramAnonymousInt]);
        if (DialogPreference.c(DialogPreference.this) != null)
          DialogPreference.c(DialogPreference.this).dAx();
        if (DialogPreference.d(DialogPreference.this) != null)
          DialogPreference.d(DialogPreference.this).a(DialogPreference.this, DialogPreference.this.getValue());
        AppMethodBeat.o(107154);
      }
    });
    localListViewInScrollView.setAdapter(this.yBx);
    c.a locala = new c.a(this.mContext);
    locala.asD(getTitle().toString());
    locala.fn(localListViewInScrollView);
    this.gud = locala.aMb();
    this.gud.show();
    h.a(this.mContext, this.gud);
    AppMethodBeat.o(107158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.DialogPreference
 * JD-Core Version:    0.6.2
 */