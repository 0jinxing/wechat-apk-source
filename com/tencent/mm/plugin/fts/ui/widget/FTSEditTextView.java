package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.c.b;
import com.tencent.mm.ui.tools.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FTSEditTextView extends LinearLayout
{
  private String hint;
  private ImageView iqT;
  private List<a.b> kPL;
  public EditText mLL;
  private TextView mLM;
  private TextView mLN;
  private TextView mLO;
  private View mLP;
  private boolean mLQ;
  private String mLR;
  private View.OnClickListener mLS;
  private FTSEditTextView.a mLT;
  private FTSEditTextView.b mLU;
  protected View.OnFocusChangeListener mLV;
  private ImageButton mpR;

  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62115);
    this.mLQ = true;
    this.mLR = "";
    this.mLS = new FTSEditTextView.6(this);
    this.mLU = FTSEditTextView.b.mLX;
    this.mLV = new FTSEditTextView.7(this);
    init();
    AppMethodBeat.o(62115);
  }

  public FTSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62116);
    this.mLQ = true;
    this.mLR = "";
    this.mLS = new FTSEditTextView.6(this);
    this.mLU = FTSEditTextView.b.mLX;
    this.mLV = new FTSEditTextView.7(this);
    init();
    AppMethodBeat.o(62116);
  }

  private void a(String paramString, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(62124);
    this.kPL.clear();
    if (paramList != null)
      this.kPL.addAll(paramList);
    ab.i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", new Object[] { paramString, Integer.valueOf(this.kPL.size()) });
    this.mLU = FTSEditTextView.b.mLZ;
    this.mLL.setText(paramString);
    Selection.setSelection(this.mLL.getText(), this.mLL.getText().length());
    bBp();
    this.mLU = paramb;
    AppMethodBeat.o(62124);
  }

  private void bBp()
  {
    AppMethodBeat.i(62127);
    ab.i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", new Object[] { Integer.valueOf(this.kPL.size()) });
    float f = a.al(getContext(), 2131427813);
    if (this.kPL.size() > 0)
    {
      this.mLM.setVisibility(0);
      this.mLM.setText(b.c(getContext(), ((a.b)this.kPL.get(0)).getTagName(), f));
      if (this.kPL.size() < 2)
        break label221;
      this.mLN.setVisibility(0);
      this.mLN.setText(b.c(getContext(), ((a.b)this.kPL.get(1)).getTagName(), f));
      label149: if (this.kPL.size() < 3)
        break label233;
      this.mLO.setVisibility(0);
      this.mLO.setText(b.c(getContext(), ((a.b)this.kPL.get(2)).getTagName(), f));
      AppMethodBeat.o(62127);
    }
    while (true)
    {
      return;
      this.mLM.setVisibility(8);
      break;
      label221: this.mLN.setVisibility(8);
      break label149;
      label233: this.mLO.setVisibility(8);
      AppMethodBeat.o(62127);
    }
  }

  protected void bBm()
  {
    AppMethodBeat.i(62117);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130969619, this, true);
    AppMethodBeat.o(62117);
  }

  public final void bBn()
  {
    AppMethodBeat.i(62121);
    postDelayed(new FTSEditTextView.5(this), 128L);
    AppMethodBeat.o(62121);
  }

  public final void bBo()
  {
    AppMethodBeat.i(62125);
    this.mLL.requestFocus();
    AppMethodBeat.o(62125);
  }

  public final void bBq()
  {
    AppMethodBeat.i(62130);
    this.iqT.setVisibility(8);
    AppMethodBeat.o(62130);
  }

  public final void bBr()
  {
    AppMethodBeat.i(62131);
    this.iqT.setVisibility(0);
    AppMethodBeat.o(62131);
  }

  public final void bBs()
  {
    AppMethodBeat.i(62132);
    this.mpR.setVisibility(8);
    AppMethodBeat.o(62132);
  }

  public final void bBt()
  {
    AppMethodBeat.i(62133);
    this.mpR.setVisibility(0);
    AppMethodBeat.o(62133);
  }

  public final void clearText()
  {
    AppMethodBeat.i(62119);
    this.mLU = FTSEditTextView.b.mLY;
    if (this.mLQ)
      this.kPL.clear();
    this.mLL.setText("");
    this.mLL.setHint(this.hint);
    this.mpR.setVisibility(8);
    bBp();
    this.mLU = FTSEditTextView.b.mLX;
    AppMethodBeat.o(62119);
  }

  public ImageButton getClearBtn()
  {
    return this.mpR;
  }

  public EditText getEditText()
  {
    return this.mLL;
  }

  public int getHighlightColor()
  {
    AppMethodBeat.i(62122);
    int i = this.mLL.getHighlightColor();
    AppMethodBeat.o(62122);
    return i;
  }

  public ImageView getIconView()
  {
    return this.iqT;
  }

  public String getInEditTextQuery()
  {
    AppMethodBeat.i(62128);
    String str = this.mLL.getText().toString().trim();
    AppMethodBeat.o(62128);
    return str;
  }

  public List<a.b> getTagList()
  {
    return this.kPL;
  }

  public View getTagPanel()
  {
    return this.mLP;
  }

  public FTSEditTextView.b getTextChangeStatus()
  {
    return this.mLU;
  }

  public String getTotalQuery()
  {
    AppMethodBeat.i(62129);
    Object localObject = new StringBuffer();
    Iterator localIterator = this.kPL.iterator();
    while (localIterator.hasNext())
    {
      ((StringBuffer)localObject).append(((a.b)localIterator.next()).getTagName());
      ((StringBuffer)localObject).append(" ");
    }
    ((StringBuffer)localObject).append(this.mLL.getText().toString());
    localObject = ((StringBuffer)localObject).toString().trim();
    AppMethodBeat.o(62129);
    return localObject;
  }

  protected void init()
  {
    AppMethodBeat.i(62118);
    bBm();
    this.mLP = findViewById(2131824219);
    this.iqT = ((ImageView)findViewById(2131820915));
    this.mLL = ((EditText)findViewById(2131820980));
    this.mpR = ((ImageButton)findViewById(2131820976));
    this.mLM = ((TextView)findViewById(2131824220));
    this.mLN = ((TextView)findViewById(2131824221));
    this.mLO = ((TextView)findViewById(2131824222));
    this.kPL = new ArrayList();
    this.mLL.setOnKeyListener(new FTSEditTextView.1(this));
    this.mLL.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(62106);
        paramAnonymousCharSequence = FTSEditTextView.this.getTotalQuery();
        if ((paramAnonymousCharSequence != FTSEditTextView.f(FTSEditTextView.this)) && (!paramAnonymousCharSequence.equals(FTSEditTextView.f(FTSEditTextView.this))))
        {
          FTSEditTextView.a(FTSEditTextView.this, paramAnonymousCharSequence);
          if (paramAnonymousCharSequence.length() <= 0)
            break label78;
          FTSEditTextView.g(FTSEditTextView.this).setVisibility(0);
        }
        while (true)
        {
          FTSEditTextView.e(FTSEditTextView.this);
          AppMethodBeat.o(62106);
          return;
          label78: FTSEditTextView.g(FTSEditTextView.this).setVisibility(8);
        }
      }
    });
    this.mLL.setOnFocusChangeListener(this.mLV);
    this.mLL.setOnEditorActionListener(new FTSEditTextView.3(this));
    this.mLM.setOnClickListener(this.mLS);
    this.mLN.setOnClickListener(this.mLS);
    this.mLO.setOnClickListener(this.mLS);
    this.mpR.setOnClickListener(new FTSEditTextView.4(this));
    c.d(this.mLL).PM(100).a(null);
    AppMethodBeat.o(62118);
  }

  public final void n(String paramString, List<a.b> paramList)
  {
    AppMethodBeat.i(62123);
    a(paramString, paramList, FTSEditTextView.b.mLX);
    AppMethodBeat.o(62123);
  }

  public void setCanDeleteTag(boolean paramBoolean)
  {
    this.mLQ = paramBoolean;
  }

  public void setEditTextDrawableLeft(int paramInt)
  {
    AppMethodBeat.i(62120);
    if (paramInt == -1)
    {
      this.mLL.setCompoundDrawablesRelative(null, null, null, null);
      AppMethodBeat.o(62120);
    }
    while (true)
    {
      return;
      Drawable localDrawable = getContext().getResources().getDrawable(paramInt);
      localDrawable.setBounds(0, 0, a.fromDPToPix(getContext(), 15), a.fromDPToPix(getContext(), 15));
      this.mLL.setCompoundDrawablesRelative(localDrawable, null, null, null);
      AppMethodBeat.o(62120);
    }
  }

  public void setFtsEditTextListener(FTSEditTextView.a parama)
  {
    this.mLT = parama;
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(62126);
    this.mLL.setHint(paramString);
    this.hint = paramString;
    AppMethodBeat.o(62126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView
 * JD-Core Version:    0.6.2
 */