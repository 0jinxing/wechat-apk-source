package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import java.util.HashMap;
import junit.framework.Assert;

public final class ChoicePreference extends Preference
{
  private int piC;
  String value;
  private final HashMap<CharSequence, b> values;
  private RadioGroup yBs;
  private CharSequence[] yBt;
  private CharSequence[] yBu;
  public Preference.a yBv;

  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107146);
    this.values = new HashMap();
    this.piC = -1;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ChoicePreference, paramInt, 0);
    this.yBt = paramContext.getTextArray(0);
    this.yBu = paramContext.getTextArray(1);
    paramContext.recycle();
    dAw();
    AppMethodBeat.o(107146);
  }

  private void dAw()
  {
    int i = 0;
    AppMethodBeat.i(107148);
    if (this.yBt == null)
      this.yBt = new CharSequence[0];
    if (this.yBu == null)
      this.yBu = new CharSequence[0];
    if (this.yBt.length == this.yBu.length);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.yBu.length)
      {
        b localb = new b(this.yBt[i], 1048576 + i);
        this.values.put(this.yBu[i], localb);
        i++;
      }
    }
    AppMethodBeat.o(107148);
  }

  public final void a(Preference.a parama)
  {
    this.yBv = parama;
  }

  protected final void onBindView(View paramView)
  {
    AppMethodBeat.i(107149);
    super.onBindView(paramView);
    if (this.yBs != null)
      this.yBs.check(this.piC);
    AppMethodBeat.o(107149);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107147);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    Object localObject = (ViewGroup)localView.findViewById(2131821019);
    ((ViewGroup)localObject).removeAllViews();
    paramViewGroup.inflate(2130970146, (ViewGroup)localObject);
    this.yBs = ((RadioGroup)localView.findViewById(2131826032));
    int i = 0;
    if (i < this.yBu.length)
    {
      localObject = this.yBu[i];
      localObject = (b)this.values.get(localObject);
      RadioButton localRadioButton;
      if (localObject != null)
      {
        if (i != 0)
          break label134;
        localRadioButton = (RadioButton)paramViewGroup.inflate(2130970104, null);
        ((b)localObject).a(localRadioButton);
        this.yBs.addView(localRadioButton);
      }
      while (true)
      {
        i++;
        break;
        label134: if (i == this.yBu.length - 1)
        {
          localRadioButton = (RadioButton)paramViewGroup.inflate(2130970106, null);
          ((b)localObject).a(localRadioButton);
          this.yBs.addView(localRadioButton);
        }
        else
        {
          localRadioButton = (RadioButton)paramViewGroup.inflate(2130970105, null);
          ((b)localObject).a(localRadioButton);
          this.yBs.addView(localRadioButton);
        }
      }
    }
    this.yBs.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        AppMethodBeat.i(107145);
        if (ChoicePreference.a(ChoicePreference.this) != null)
        {
          if (paramAnonymousInt == -1)
            break label92;
          ChoicePreference.a(ChoicePreference.this, ChoicePreference.b(ChoicePreference.this)[(paramAnonymousInt - 1048576)]);
        }
        while (true)
        {
          ChoicePreference.a(ChoicePreference.this, paramAnonymousInt);
          ChoicePreference.a(ChoicePreference.this).a(ChoicePreference.this, ChoicePreference.this.value);
          AppMethodBeat.o(107145);
          return;
          label92: ChoicePreference.a(ChoicePreference.this, null);
        }
      }
    });
    AppMethodBeat.o(107147);
    return localView;
  }

  public final void setValue(String paramString)
  {
    AppMethodBeat.i(107150);
    this.value = paramString;
    paramString = (b)this.values.get(paramString);
    if (paramString == null)
    {
      this.piC = -1;
      AppMethodBeat.o(107150);
    }
    while (true)
    {
      return;
      this.piC = paramString.id;
      AppMethodBeat.o(107150);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.ChoicePreference
 * JD-Core Version:    0.6.2
 */