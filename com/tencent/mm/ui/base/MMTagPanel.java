package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.c.b;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MMTagPanel extends FlowLayout
{
  public boolean mXt;
  private boolean mjY;
  private int mlt;
  private int mlu;
  private int nCZ;
  private int nDa;
  private LinkedList<d> wiH;
  private boolean yxA;
  private View.OnClickListener yxB;
  public boolean yxl;
  private boolean yxm;
  public boolean yxn;
  public boolean yxo;
  public boolean yxp;
  private int yxq;
  private int yxr;
  private int yxs;
  private int yxt;
  private d yxu;
  private LinkedList<d> yxv;
  private a yxw;
  private int yxx;
  private View yxy;
  MMEditText yxz;

  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106829);
    this.mjY = false;
    this.yxl = true;
    this.yxm = false;
    this.yxn = true;
    this.yxo = false;
    this.yxp = false;
    this.yxq = 2130840372;
    this.yxr = 0;
    this.mlu = 2130840382;
    this.mlt = 2131690316;
    this.nCZ = 2130840376;
    this.nDa = 2131690683;
    this.yxs = 2130840379;
    this.yxt = 2131690691;
    this.yxu = null;
    this.wiH = new LinkedList();
    this.yxv = new LinkedList();
    this.yxA = false;
    this.yxB = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        AppMethodBeat.i(106820);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) == null)
            break label321;
          paramAnonymousView.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(106817);
              MMTagPanel.e(MMTagPanel.this).JS(((TextView)paramAnonymousView).getText().toString());
              AppMethodBeat.o(106817);
            }
          });
          AppMethodBeat.o(106820);
        }
        while (true)
        {
          return;
          if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
          {
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null)
            {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(106818);
                  MMTagPanel.e(MMTagPanel.this).JR(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(106818);
                }
              });
              AppMethodBeat.o(106820);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this) == null)
          {
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null)
            {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).yxN, false, true);
              AppMethodBeat.o(106820);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this).yxN == paramAnonymousView)
          {
            MMTagPanel.a(MMTagPanel.this, null);
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null)
            {
              paramAnonymousView.post(new MMTagPanel.8.3(this, paramAnonymousView));
              AppMethodBeat.o(106820);
            }
          }
          else
          {
            MMTagPanel.this.dAf();
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).yxN, false, true);
            label321: AppMethodBeat.o(106820);
          }
        }
      }
    };
    this.mXt = true;
    init();
    AppMethodBeat.o(106829);
  }

  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106828);
    this.mjY = false;
    this.yxl = true;
    this.yxm = false;
    this.yxn = true;
    this.yxo = false;
    this.yxp = false;
    this.yxq = 2130840372;
    this.yxr = 0;
    this.mlu = 2130840382;
    this.mlt = 2131690316;
    this.nCZ = 2130840376;
    this.nDa = 2131690683;
    this.yxs = 2130840379;
    this.yxt = 2131690691;
    this.yxu = null;
    this.wiH = new LinkedList();
    this.yxv = new LinkedList();
    this.yxA = false;
    this.yxB = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        AppMethodBeat.i(106820);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) == null)
            break label321;
          paramAnonymousView.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(106817);
              MMTagPanel.e(MMTagPanel.this).JS(((TextView)paramAnonymousView).getText().toString());
              AppMethodBeat.o(106817);
            }
          });
          AppMethodBeat.o(106820);
        }
        while (true)
        {
          return;
          if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
          {
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null)
            {
              paramAnonymousView.post(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(106818);
                  MMTagPanel.e(MMTagPanel.this).JR(((TextView)paramAnonymousView).getText().toString());
                  AppMethodBeat.o(106818);
                }
              });
              AppMethodBeat.o(106820);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this) == null)
          {
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            if (MMTagPanel.d(MMTagPanel.this) != null)
            {
              MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).yxN, false, true);
              AppMethodBeat.o(106820);
            }
          }
          else if (MMTagPanel.d(MMTagPanel.this).yxN == paramAnonymousView)
          {
            MMTagPanel.a(MMTagPanel.this, null);
            MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
            if (MMTagPanel.e(MMTagPanel.this) != null)
            {
              paramAnonymousView.post(new MMTagPanel.8.3(this, paramAnonymousView));
              AppMethodBeat.o(106820);
            }
          }
          else
          {
            MMTagPanel.this.dAf();
            MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).yxN, false, true);
            label321: AppMethodBeat.o(106820);
          }
        }
      }
    };
    this.mXt = true;
    init();
    AppMethodBeat.o(106828);
  }

  private void a(d paramd)
  {
    AppMethodBeat.i(106845);
    paramd.yxN.setOnClickListener(null);
    if (this.yxv.size() >= 16)
      AppMethodBeat.o(106845);
    while (true)
    {
      return;
      this.yxv.add(paramd);
      AppMethodBeat.o(106845);
    }
  }

  private void init()
  {
    AppMethodBeat.i(106830);
    this.yxx = getContext().getResources().getDimensionPixelSize(2131427762);
    this.yxy = LayoutInflater.from(getContext()).inflate(2130970223, null);
    this.yxz = ((MMEditText)this.yxy.findViewById(2131820980));
    this.yxz.setOnKeyListener(new MMTagPanel.1(this));
    this.yxz.addTextChangedListener(new MMTagPanel.2(this));
    this.yxz.setOnFocusChangeListener(new MMTagPanel.3(this));
    this.yxz.setOnClickListener(new MMTagPanel.4(this));
    this.yxz.setOnEditorActionListener(new MMTagPanel.5(this));
    c localc = new c();
    b localb = new b();
    this.yxz.setFilters(new InputFilter[] { localc, localb });
    dAd();
    setOnClickListener(new MMTagPanel.6(this));
    setOnTouchListener(new MMTagPanel.7(this, localc));
    AppMethodBeat.o(106830);
  }

  public final void a(TextView paramTextView, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(106848);
    paramTextView.setTextSize(0, getContext().getResources().getDimension(2131427762) * a.dm(getContext()));
    if (paramBoolean2)
    {
      paramTextView.setBackgroundResource(this.yxs);
      paramTextView.setTextColor(getResources().getColor(this.yxt));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.yxq, 0);
      AppMethodBeat.o(106848);
    }
    while (true)
    {
      return;
      if (paramBoolean1)
      {
        paramTextView.setTag(Integer.valueOf(1));
        paramTextView.setBackgroundResource(this.nCZ);
        paramTextView.setTextColor(getResources().getColor(this.nDa));
        paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        AppMethodBeat.o(106848);
      }
      else
      {
        paramTextView.setTag(Integer.valueOf(0));
        paramTextView.setBackgroundResource(this.mlu);
        paramTextView.setTextColor(getResources().getColor(this.mlt));
        paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        AppMethodBeat.o(106848);
      }
    }
  }

  protected final void a(d paramd, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(106846);
    paramd.yxM = paramString;
    paramd.yxN.setText(b.h(getContext(), paramString, this.yxx));
    TextView localTextView = paramd.yxN;
    if (this.yxl);
    for (paramString = this.yxB; ; paramString = null)
    {
      localTextView.setOnClickListener(paramString);
      a(paramd.yxN, paramBoolean, false);
      AppMethodBeat.o(106846);
      return;
    }
  }

  public final void a(Collection<String> paramCollection, List<String> paramList)
  {
    AppMethodBeat.i(106843);
    dzU();
    if (this.yxm)
      addView(this.yxy);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(106843);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      if (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if (paramCollection == null);
        for (boolean bool = false; ; bool = paramCollection.contains(paramList))
        {
          cc(paramList, bool);
          break;
        }
      }
      AppMethodBeat.o(106843);
    }
  }

  protected void bwC()
  {
  }

  public final void cc(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(106849);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
      AppMethodBeat.o(106849);
    }
    while (true)
    {
      return;
      paramString = paramString.trim();
      ab.d("MicroMsg.MMTagPanel", "want to add tag %s, do remove tag first", new Object[] { paramString });
      removeTag(paramString);
      localObject = this.wiH.iterator();
      do
        if (!((Iterator)localObject).hasNext())
          break;
      while (!paramString.equals(((d)((Iterator)localObject).next()).yxM));
      ab.w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", new Object[] { paramString });
      AppMethodBeat.o(106849);
    }
    Object localObject = dAe();
    a((d)localObject, paramString, paramBoolean);
    this.wiH.add(localObject);
    if (this.yxm)
      addView(((d)localObject).yxN, getChildCount() - 1);
    while (true)
    {
      dAf();
      AppMethodBeat.o(106849);
      break;
      addView(((d)localObject).yxN);
    }
  }

  public final void cd(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(106852);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
      AppMethodBeat.o(106852);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.wiH.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          d locald = (d)localIterator.next();
          if (paramString.equals(locald.yxM))
          {
            a(locald, paramString, paramBoolean);
            dAf();
            AppMethodBeat.o(106852);
            break;
          }
        }
      ab.w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", new Object[] { paramString });
      AppMethodBeat.o(106852);
    }
  }

  public final void dAb()
  {
    AppMethodBeat.i(106835);
    if (this.yxz != null)
      this.yxz.setText("");
    AppMethodBeat.o(106835);
  }

  public final void dAc()
  {
    AppMethodBeat.i(106836);
    if ((this.yxz == null) || (this.yxz.isFocused()))
      AppMethodBeat.o(106836);
    while (true)
    {
      return;
      this.yxz.requestFocus();
      AppMethodBeat.o(106836);
    }
  }

  public final void dAd()
  {
    AppMethodBeat.i(106837);
    InputMethodManager localInputMethodManager;
    if ((this.yxz != null) && (this.yxz.isFocused()))
    {
      ab.d("MicroMsg.MMTagPanel", "do clear edit focus");
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
        AppMethodBeat.o(106837);
    }
    while (true)
    {
      return;
      IBinder localIBinder = this.yxz.getWindowToken();
      if (localIBinder == null)
      {
        AppMethodBeat.o(106837);
      }
      else
      {
        localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
        this.yxz.clearFocus();
        AppMethodBeat.o(106837);
      }
    }
  }

  protected final d dAe()
  {
    AppMethodBeat.i(106844);
    if (!this.yxv.isEmpty())
    {
      localObject = (d)this.yxv.removeFirst();
      AppMethodBeat.o(106844);
      return localObject;
    }
    d locald = new d();
    TextView localTextView = new TextView(getContext());
    localTextView.setBackgroundResource(this.mlu);
    localTextView.setTextColor(getResources().getColor(this.mlt));
    localTextView.setTag(Integer.valueOf(0));
    localTextView.setGravity(17);
    localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.yxq, 0);
    if (this.yxl);
    for (Object localObject = this.yxB; ; localObject = null)
    {
      localTextView.setOnClickListener((View.OnClickListener)localObject);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      localTextView.setSingleLine();
      locald.yxN = localTextView;
      AppMethodBeat.o(106844);
      localObject = locald;
      break;
    }
  }

  protected final void dAf()
  {
    AppMethodBeat.i(106847);
    if (this.yxz != null)
    {
      ab.d("MicroMsg.MMTagPanel", "do clear high light info, edittext is focus %B", new Object[] { Boolean.valueOf(this.yxz.isFocused()) });
      this.yxz.setCursorVisible(true);
    }
    if (this.yxu == null)
    {
      AppMethodBeat.o(106847);
      return;
    }
    TextView localTextView = this.yxu.yxN;
    if (((Integer)this.yxu.yxN.getTag()).intValue() == 1);
    for (boolean bool = true; ; bool = false)
    {
      a(localTextView, bool, false);
      this.yxu = null;
      AppMethodBeat.o(106847);
      break;
    }
  }

  public final void dAg()
  {
    AppMethodBeat.i(106851);
    Iterator localIterator = this.wiH.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      removeView(locald.yxN);
      a(locald);
    }
    this.wiH.clear();
    dAf();
    AppMethodBeat.o(106851);
  }

  public void dzU()
  {
    AppMethodBeat.i(106842);
    this.wiH.clear();
    removeAllViews();
    Iterator localIterator = this.wiH.iterator();
    while (localIterator.hasNext())
      a((d)localIterator.next());
    AppMethodBeat.o(106842);
  }

  public String getEditText()
  {
    AppMethodBeat.i(106834);
    String str;
    if (this.yxz != null)
    {
      str = this.yxz.getText().toString();
      AppMethodBeat.o(106834);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(106834);
    }
  }

  public int getTagCount()
  {
    AppMethodBeat.i(106841);
    int i = this.wiH.size();
    AppMethodBeat.o(106841);
    return i;
  }

  public ArrayList<String> getTagList()
  {
    AppMethodBeat.i(106840);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.wiH.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (!bo.isNullOrNil(locald.yxM))
        localArrayList.add(locald.yxM);
    }
    AppMethodBeat.o(106840);
    return localArrayList;
  }

  public Set<String> getTagSet()
  {
    AppMethodBeat.i(106839);
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = this.wiH.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (!bo.isNullOrNil(locald.yxM))
        localTreeSet.add(locald.yxM);
    }
    AppMethodBeat.o(106839);
    return localTreeSet;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106853);
    boolean bool;
    if (this.mXt)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(106853);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(106853);
    }
  }

  public final void qe(boolean paramBoolean)
  {
    AppMethodBeat.i(106838);
    if (paramBoolean == this.yxm)
      AppMethodBeat.o(106838);
    while (true)
    {
      return;
      this.yxm = paramBoolean;
      removeView(this.yxy);
      if (this.yxm)
      {
        addView(this.yxy);
        dAd();
      }
      AppMethodBeat.o(106838);
    }
  }

  public final void removeTag(String paramString)
  {
    AppMethodBeat.i(106850);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
      AppMethodBeat.o(106850);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.wiH.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          d locald = (d)localIterator.next();
          if (paramString.equals(locald.yxM))
          {
            this.wiH.remove(locald);
            removeView(locald.yxN);
            a(locald);
            dAf();
            AppMethodBeat.o(106850);
            break;
          }
        }
      ab.w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", new Object[] { paramString });
      AppMethodBeat.o(106850);
    }
  }

  public void setCallBack(a parama)
  {
    this.yxw = parama;
  }

  public void setEditHint(String paramString)
  {
    AppMethodBeat.i(106833);
    if (this.yxz != null)
      this.yxz.setHint(paramString);
    AppMethodBeat.o(106833);
  }

  public void setEditTextColor(int paramInt)
  {
    AppMethodBeat.i(106832);
    if (this.yxz != null)
      this.yxz.setTextColor(paramInt);
    AppMethodBeat.o(106832);
  }

  public void setEditTextHit(boolean paramBoolean)
  {
    AppMethodBeat.i(106854);
    if (this.yxz != null)
      if (paramBoolean)
      {
        this.yxz.setHint(2131296420);
        AppMethodBeat.o(106854);
      }
    while (true)
    {
      return;
      this.yxz.setHint("");
      AppMethodBeat.o(106854);
    }
  }

  public void setIsAllowEnterCharacter(boolean paramBoolean)
  {
    this.yxA = paramBoolean;
  }

  public void setPanelClickable(boolean paramBoolean)
  {
    this.mXt = paramBoolean;
  }

  public void setTagEditTextBG(int paramInt)
  {
    AppMethodBeat.i(106831);
    this.yxr = paramInt;
    if (this.yxz != null)
    {
      a.fromDPToPix(getContext(), 6);
      getResources().getDimensionPixelSize(2131427812);
      this.yxz.setBackgroundResource(this.yxr);
    }
    AppMethodBeat.o(106831);
  }

  public void setTagHighlineBG(int paramInt)
  {
    this.yxs = paramInt;
  }

  public void setTagNormalBG(int paramInt)
  {
    this.mlu = paramInt;
  }

  public void setTagNormalTextColorRes(int paramInt)
  {
    this.mlt = paramInt;
  }

  public void setTagSelectedBG(int paramInt)
  {
    this.nCZ = paramInt;
  }

  public void setTagSelectedTextColorRes(int paramInt)
  {
    this.nDa = paramInt;
  }

  public void setTagTipsDrawable(int paramInt)
  {
    this.yxq = paramInt;
  }

  public void setTaghighlineTextColorRes(int paramInt)
  {
    this.yxt = paramInt;
  }

  public static abstract interface a
  {
    public abstract void JR(String paramString);

    public abstract void JS(String paramString);

    public abstract void JT(String paramString);

    public abstract void JU(String paramString);

    public abstract void JV(String paramString);

    public abstract void bmm();

    public abstract void q(boolean paramBoolean, int paramInt);
  }

  public final class b
    implements InputFilter
  {
    int mark;
    List<String> yxF;

    public b()
    {
      AppMethodBeat.i(106824);
      this.yxF = new LinkedList();
      AppMethodBeat.o(106824);
    }

    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(106825);
      ab.d("MicroMsg.MMTagPanel", "on create tag filter, %s [%d, %d) %s [%d, %d), maxlength[%B]", new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramSpanned, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(MMTagPanel.i(MMTagPanel.this)) });
      this.mark = -1;
      this.yxF.clear();
      Object localObject1 = new char[paramInt2 - paramInt1];
      TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, (char[])localObject1, 0);
      int i;
      Object localObject2;
      if (!MMTagPanel.j(MMTagPanel.this))
      {
        i = 0;
        localObject2 = new StringBuilder();
        if (paramInt1 < paramInt2)
        {
          if (localObject1[paramInt1] == '\n')
            i = 1;
          while (true)
          {
            paramInt1++;
            break;
            ((StringBuilder)localObject2).append(localObject1[paramInt1]);
          }
        }
        if (i != 0)
        {
          paramCharSequence = ((StringBuilder)localObject2).toString();
          ((StringBuilder)localObject2).insert(0, paramSpanned.subSequence(0, paramInt3));
          ((StringBuilder)localObject2).append(paramSpanned.subSequence(paramInt4, paramSpanned.length()));
          MMTagPanel.this.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(106821);
              MMTagPanel.e(MMTagPanel.this).JV(this.ybH.toString());
              AppMethodBeat.o(106821);
            }
          });
          AppMethodBeat.o(106825);
        }
      }
      while (true)
      {
        return paramCharSequence;
        paramCharSequence = null;
        AppMethodBeat.o(106825);
        continue;
        i = paramInt1;
        if (i < paramInt2)
        {
          if ((localObject1[i] == '\n') || (localObject1[i] == ',') || (localObject1[i] == ';') || (localObject1[i] == '、') || (localObject1[i] == 65292) || (localObject1[i] == 65307))
          {
            if (-1 != this.mark)
              break label388;
            this.yxF.add((paramSpanned.subSequence(0, paramInt3).toString() + paramCharSequence.subSequence(paramInt1, i)).trim());
          }
          while (true)
          {
            this.mark = (i + 1);
            i++;
            break;
            label388: this.yxF.add(paramCharSequence.subSequence(this.mark, i).toString().trim());
          }
        }
        if (MMTagPanel.h(MMTagPanel.this))
        {
          paramInt1 = f.asg(paramSpanned.toString());
          if ((MMTagPanel.i(MMTagPanel.this)) && (paramCharSequence.equals("\n")) && (36 < paramInt1))
            this.yxF.clear();
        }
        if (!this.yxF.isEmpty())
          break;
        paramCharSequence = null;
        AppMethodBeat.o(106825);
      }
      if (MMTagPanel.e(MMTagPanel.this) != null)
      {
        localObject2 = this.yxF.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (String)((Iterator)localObject2).next();
          if (((String)localObject1).length() > 0)
            MMTagPanel.this.post(new MMTagPanel.b.2(this, (String)localObject1));
        }
      }
      if (this.mark >= paramInt2)
        paramSpanned.length();
      for (paramCharSequence = paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString(); ; paramCharSequence = paramCharSequence.subSequence(this.mark, paramInt2).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()))
      {
        MMTagPanel.this.post(new MMTagPanel.b.3(this, paramCharSequence));
        paramCharSequence = "";
        AppMethodBeat.o(106825);
        break;
      }
    }
  }

  public final class c
    implements InputFilter
  {
    int yxI = 36;
    private int yxJ = 256;
    private int yxK;

    public c()
    {
    }

    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(106827);
      paramInt1 = f.asg(paramSpanned.toString()) + f.asg(paramCharSequence.toString());
      if (paramInt4 > paramInt3)
        if (paramInt1 - (paramInt4 - paramInt3) > this.yxI)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.yxK = (paramInt1 - (paramInt4 - paramInt3) - this.yxI);
          if ((MMTagPanel.h(MMTagPanel.this)) && (1 == this.yxK) && (paramCharSequence.equals("\n")))
            this.yxK = 0;
          if (MMTagPanel.e(MMTagPanel.this) != null)
            MMTagPanel.this.post(new MMTagPanel.c.1(this));
          if (paramInt1 <= this.yxJ)
            break label200;
          paramCharSequence = "";
          AppMethodBeat.o(106827);
        }
      while (true)
      {
        return paramCharSequence;
        MMTagPanel.a(MMTagPanel.this, false);
        break;
        if (paramInt1 > this.yxI)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.yxK = (paramInt1 - this.yxI);
          break;
        }
        MMTagPanel.a(MMTagPanel.this, false);
        break;
        label200: AppMethodBeat.o(106827);
      }
    }
  }

  public static final class d
  {
    public String yxM;
    public TextView yxN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel
 * JD-Core Version:    0.6.2
 */