package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActionBarSearchView extends LinearLayout
  implements d
{
  private boolean qlP;
  private TextWatcher vog;
  private ImageButton zAa;
  private c zAb;
  private boolean zAc;
  private s zAd;
  private b zAe;
  private a zAf;
  private View.OnFocusChangeListener zAg;
  private View.OnFocusChangeListener zAh;
  private View.OnClickListener zAi;
  private View.OnClickListener zAj;
  private View zzY;
  protected ActionBarEditText zzZ;

  public ActionBarSearchView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(107564);
    this.zAb = c.zAm;
    this.zAc = false;
    this.qlP = false;
    this.vog = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(107549);
        ActionBarSearchView.a(ActionBarSearchView.this);
        s locals = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        Object localObject;
        if (locals.zIe)
        {
          localEditText = (EditText)locals.zIc.get();
          if (localEditText != null);
        }
        else if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
        {
          localObject = ActionBarSearchView.c(ActionBarSearchView.this);
          if (paramAnonymousCharSequence != null)
            break label253;
        }
        label253: for (paramAnonymousCharSequence = ""; ; paramAnonymousCharSequence = paramAnonymousCharSequence.toString())
        {
          ((ActionBarSearchView.b)localObject).Qa(paramAnonymousCharSequence);
          AppMethodBeat.o(107549);
          return;
          if (((paramAnonymousCharSequence != null) && (paramAnonymousCharSequence.toString() != null) && (paramAnonymousCharSequence.toString().length() != 0)) || ((locals.mText == null) || (locals.mText.length() == 0) || ((locals.mText != null) && (paramAnonymousCharSequence != null) && (locals.mText.equals(paramAnonymousCharSequence.toString())))))
          {
            ab.d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", new Object[] { paramAnonymousCharSequence, locals.mText });
            break;
          }
          if (paramAnonymousCharSequence != null);
          for (localObject = paramAnonymousCharSequence.toString(); ; localObject = "")
          {
            locals.mText = ((String)localObject);
            locals.zIb = s.m(locals.mText, locals.zId);
            if (!s.a(localEditText, locals.zId))
              break;
            ab.d("MicroMsg.WordsChecker", "decorate text succ.");
            break;
          }
        }
      }
    };
    this.zAg = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(107550);
        ab.v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (ActionBarSearchView.d(ActionBarSearchView.this) != null)
          ActionBarSearchView.d(ActionBarSearchView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        AppMethodBeat.o(107550);
      }
    };
    this.zAi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(107551);
        if (ActionBarSearchView.c.zAm == ActionBarSearchView.e(ActionBarSearchView.this))
        {
          ab.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
          ActionBarSearchView.this.qO(true);
          if (ActionBarSearchView.c(ActionBarSearchView.this) == null)
            break label90;
          ActionBarSearchView.c(ActionBarSearchView.this).apq();
          AppMethodBeat.o(107551);
        }
        while (true)
        {
          return;
          ab.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
            ActionBarSearchView.c(ActionBarSearchView.this).bKu();
          label90: AppMethodBeat.o(107551);
        }
      }
    };
    this.zAj = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(107552);
        if (ActionBarSearchView.f(ActionBarSearchView.this) != null)
          ActionBarSearchView.f(ActionBarSearchView.this).bKv();
        AppMethodBeat.o(107552);
      }
    };
    init();
    AppMethodBeat.o(107564);
  }

  public ActionBarSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107563);
    this.zAb = c.zAm;
    this.zAc = false;
    this.qlP = false;
    this.vog = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(107549);
        ActionBarSearchView.a(ActionBarSearchView.this);
        s locals = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        Object localObject;
        if (locals.zIe)
        {
          localEditText = (EditText)locals.zIc.get();
          if (localEditText != null);
        }
        else if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
        {
          localObject = ActionBarSearchView.c(ActionBarSearchView.this);
          if (paramAnonymousCharSequence != null)
            break label253;
        }
        label253: for (paramAnonymousCharSequence = ""; ; paramAnonymousCharSequence = paramAnonymousCharSequence.toString())
        {
          ((ActionBarSearchView.b)localObject).Qa(paramAnonymousCharSequence);
          AppMethodBeat.o(107549);
          return;
          if (((paramAnonymousCharSequence != null) && (paramAnonymousCharSequence.toString() != null) && (paramAnonymousCharSequence.toString().length() != 0)) || ((locals.mText == null) || (locals.mText.length() == 0) || ((locals.mText != null) && (paramAnonymousCharSequence != null) && (locals.mText.equals(paramAnonymousCharSequence.toString())))))
          {
            ab.d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", new Object[] { paramAnonymousCharSequence, locals.mText });
            break;
          }
          if (paramAnonymousCharSequence != null);
          for (localObject = paramAnonymousCharSequence.toString(); ; localObject = "")
          {
            locals.mText = ((String)localObject);
            locals.zIb = s.m(locals.mText, locals.zId);
            if (!s.a(localEditText, locals.zId))
              break;
            ab.d("MicroMsg.WordsChecker", "decorate text succ.");
            break;
          }
        }
      }
    };
    this.zAg = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(107550);
        ab.v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (ActionBarSearchView.d(ActionBarSearchView.this) != null)
          ActionBarSearchView.d(ActionBarSearchView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        AppMethodBeat.o(107550);
      }
    };
    this.zAi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(107551);
        if (ActionBarSearchView.c.zAm == ActionBarSearchView.e(ActionBarSearchView.this))
        {
          ab.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
          ActionBarSearchView.this.qO(true);
          if (ActionBarSearchView.c(ActionBarSearchView.this) == null)
            break label90;
          ActionBarSearchView.c(ActionBarSearchView.this).apq();
          AppMethodBeat.o(107551);
        }
        while (true)
        {
          return;
          ab.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
          if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
            ActionBarSearchView.c(ActionBarSearchView.this).bKu();
          label90: AppMethodBeat.o(107551);
        }
      }
    };
    this.zAj = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(107552);
        if (ActionBarSearchView.f(ActionBarSearchView.this) != null)
          ActionBarSearchView.f(ActionBarSearchView.this).bKv();
        AppMethodBeat.o(107552);
      }
    };
    init();
    AppMethodBeat.o(107563);
  }

  private void dJq()
  {
    AppMethodBeat.i(107573);
    if ((this.zzZ.getEditableText() != null) && (!bo.isNullOrNil(this.zzZ.getEditableText().toString())))
    {
      hu(2130840093, getResources().getDimensionPixelSize(2131427810));
      this.zAb = c.zAm;
      AppMethodBeat.o(107573);
    }
    while (true)
    {
      return;
      if (this.zAc)
      {
        hu(2130840572, getResources().getDimensionPixelSize(2131427810));
        this.zAb = c.zAn;
        AppMethodBeat.o(107573);
      }
      else
      {
        hu(0, 0);
        this.zAb = c.zAm;
        AppMethodBeat.o(107573);
      }
    }
  }

  private void hu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107572);
    this.zAa.setImageResource(paramInt1);
    this.zAa.setBackgroundResource(0);
    if (paramInt1 == 2130840572)
      this.zAa.setContentDescription(getContext().getString(2131304279));
    while (true)
    {
      ViewGroup.LayoutParams localLayoutParams = this.zAa.getLayoutParams();
      localLayoutParams.width = paramInt2;
      this.zAa.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(107572);
      return;
      this.zAa.setContentDescription(getContext().getString(2131298329));
    }
  }

  private void init()
  {
    AppMethodBeat.i(107565);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(getLayoutId(), this, true);
    this.zzY = findViewById(2131820977);
    this.zzY.setOnClickListener(this.zAj);
    this.zzZ = ((ActionBarEditText)findViewById(2131820980));
    this.zAd = new s(this.zzZ);
    this.zzZ.setSearchView(this);
    this.zzZ.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107553);
        ActionBarSearchView.this.zzZ.setText("");
        if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
          ActionBarSearchView.c(ActionBarSearchView.this).bKt();
        AppMethodBeat.o(107553);
      }
    });
    this.zAa = ((ImageButton)findViewById(2131820981));
    this.zzZ.addTextChangedListener(this.vog);
    this.zzZ.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(107554);
        Object localObject;
        boolean bool;
        if (paramAnonymousInt == 67)
        {
          ab.d("MicroMsg.ActionBarSearchView", "on back key click.");
          localObject = ActionBarSearchView.b(ActionBarSearchView.this);
          if (((s)localObject).zIe)
          {
            paramAnonymousKeyEvent = (EditText)((s)localObject).zIc.get();
            if ((paramAnonymousKeyEvent != null) && (((s)localObject).zIb != null));
          }
          else
          {
            AppMethodBeat.o(107554);
            bool = false;
          }
        }
        while (true)
        {
          return bool;
          paramAnonymousView = paramAnonymousKeyEvent.getText();
          paramAnonymousInt = paramAnonymousKeyEvent.getSelectionStart();
          if (paramAnonymousInt == paramAnonymousKeyEvent.getSelectionEnd())
          {
            localObject = ((s)localObject).PK(paramAnonymousInt);
            if ((localObject != null) && (((s.b)localObject).zIh))
            {
              paramAnonymousView.delete(((s.b)localObject).start, ((s.b)localObject).start + ((s.b)localObject).length);
              paramAnonymousKeyEvent.setTextKeepState(paramAnonymousView);
              paramAnonymousKeyEvent.setSelection(((s.b)localObject).start);
              bool = true;
              AppMethodBeat.o(107554);
            }
          }
          else
          {
            AppMethodBeat.o(107554);
            bool = false;
            continue;
            AppMethodBeat.o(107554);
            bool = false;
          }
        }
      }
    });
    this.zzZ.setOnSelectionChangeListener(new AutoMatchKeywordEditText.a()
    {
      public final void b(EditText paramAnonymousEditText, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(107555);
        ab.d("MicroMsg.ActionBarSearchView", "start : %d, stop : %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        Object localObject = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        if (((s)localObject).zIe)
        {
          localEditText = (EditText)((s)localObject).zIc.get();
          if ((localEditText != null) && (paramAnonymousEditText == localEditText));
        }
        else
        {
          AppMethodBeat.o(107555);
        }
        while (true)
        {
          return;
          paramAnonymousEditText = localEditText.getText();
          paramAnonymousInt2 = localEditText.getSelectionStart();
          int i = localEditText.getSelectionEnd();
          if ((paramAnonymousInt2 < 0) || (i < paramAnonymousInt2))
          {
            AppMethodBeat.o(107555);
          }
          else if (paramAnonymousInt2 == i)
          {
            localObject = ((s)localObject).PK(paramAnonymousInt2);
            if ((localObject != null) && (((s.b)localObject).zIh))
            {
              localEditText.setTextKeepState(paramAnonymousEditText);
              paramAnonymousInt1 = ((s.b)localObject).start;
              localEditText.setSelection(((s.b)localObject).length + paramAnonymousInt1);
            }
            AppMethodBeat.o(107555);
          }
          else
          {
            s.b localb = ((s)localObject).PK(paramAnonymousInt2);
            paramAnonymousInt1 = paramAnonymousInt2;
            if (localb != null)
            {
              paramAnonymousInt1 = paramAnonymousInt2;
              if (localb.zIh)
                paramAnonymousInt1 = localb.start + localb.length;
            }
            if (paramAnonymousInt1 >= i)
            {
              localEditText.setTextKeepState(paramAnonymousEditText);
              localEditText.setSelection(paramAnonymousInt1);
              AppMethodBeat.o(107555);
            }
            else
            {
              localObject = ((s)localObject).PK(i);
              if ((localObject != null) && (((s.b)localObject).zIh))
              {
                paramAnonymousInt2 = ((s.b)localObject).start;
                localEditText.setTextKeepState(paramAnonymousEditText);
                localEditText.setSelection(paramAnonymousInt1, paramAnonymousInt2);
              }
              AppMethodBeat.o(107555);
            }
          }
        }
      }
    });
    this.zzZ.setOnFocusChangeListener(this.zAg);
    c.d(this.zzZ).PM(100).a(null);
    this.zAa.setOnClickListener(this.zAi);
    AppMethodBeat.o(107565);
  }

  public final void dJr()
  {
    AppMethodBeat.i(107576);
    this.zzZ.clearFocus();
    AppMethodBeat.o(107576);
  }

  public final boolean dJs()
  {
    AppMethodBeat.i(107577);
    boolean bool;
    if (this.zzZ != null)
    {
      bool = this.zzZ.hasFocus();
      AppMethodBeat.o(107577);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107577);
    }
  }

  public final boolean dJt()
  {
    AppMethodBeat.i(107578);
    boolean bool;
    if (this.zzZ != null)
    {
      bool = this.zzZ.requestFocus();
      AppMethodBeat.o(107578);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107578);
    }
  }

  protected int getLayoutId()
  {
    return 2130968616;
  }

  public String getSearchContent()
  {
    AppMethodBeat.i(107566);
    String str;
    if (this.zzZ.getEditableText() != null)
    {
      str = this.zzZ.getEditableText().toString();
      AppMethodBeat.o(107566);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(107566);
    }
  }

  public int getSelectionEnd()
  {
    AppMethodBeat.i(107584);
    int i;
    if (this.zzZ != null)
    {
      i = this.zzZ.getSelectionEnd();
      AppMethodBeat.o(107584);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(107584);
    }
  }

  public int getSelectionStart()
  {
    AppMethodBeat.i(107583);
    int i;
    if (this.zzZ != null)
    {
      i = this.zzZ.getSelectionStart();
      AppMethodBeat.o(107583);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(107583);
    }
  }

  public final void qN(boolean paramBoolean)
  {
    AppMethodBeat.i(107569);
    this.zAc = paramBoolean;
    dJq();
    AppMethodBeat.o(107569);
  }

  public final void qO(boolean paramBoolean)
  {
    AppMethodBeat.i(107575);
    if (!paramBoolean)
    {
      this.zzZ.removeTextChangedListener(this.vog);
      this.zzZ.setText("");
      this.zzZ.addTextChangedListener(this.vog);
      AppMethodBeat.o(107575);
    }
    while (true)
    {
      return;
      this.zzZ.setText("");
      AppMethodBeat.o(107575);
    }
  }

  public void setAutoMatchKeywords(boolean paramBoolean)
  {
    if (this.zAd != null)
      this.zAd.zIe = paramBoolean;
  }

  public void setBackClickCallback(a parama)
  {
    this.zAf = parama;
  }

  public void setCallBack(b paramb)
  {
    this.zAe = paramb;
  }

  public void setEditTextClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(107579);
    if (this.zzZ != null)
    {
      this.zzZ.setFocusable(false);
      this.zzZ.setOnClickListener(paramOnClickListener);
    }
    AppMethodBeat.o(107579);
  }

  public void setEditTextEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(107570);
    this.zzZ.setEnabled(paramBoolean);
    AppMethodBeat.o(107570);
  }

  public void setFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.zAh = paramOnFocusChangeListener;
  }

  public void setHint(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107568);
    this.zzZ.setHint(paramCharSequence);
    AppMethodBeat.o(107568);
  }

  public void setKeywords(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(107580);
    if (this.zAd != null)
    {
      s locals = this.zAd;
      locals.zId = paramArrayList;
      if (locals.zIe)
      {
        paramArrayList = (EditText)locals.zIc.get();
        if (paramArrayList != null)
          s.a(paramArrayList, locals.zId);
      }
    }
    AppMethodBeat.o(107580);
  }

  public void setNotRealCallBack(SearchViewNotRealTimeHelper.a parama)
  {
  }

  public void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    AppMethodBeat.i(107574);
    this.zzZ.setOnEditorActionListener(paramOnEditorActionListener);
    AppMethodBeat.o(107574);
  }

  public void setSearchContent(String paramString)
  {
    AppMethodBeat.i(107567);
    String str = paramString;
    if (paramString == null)
      str = "";
    this.zzZ.setText(str);
    this.zzZ.setSelection(str.length());
    AppMethodBeat.o(107567);
  }

  public void setSearchTipIcon(int paramInt)
  {
    AppMethodBeat.i(107581);
    if (this.zzZ != null)
      this.zzZ.setCompoundDrawables(ah.getResources().getDrawable(paramInt), null, null, null);
    AppMethodBeat.o(107581);
  }

  public void setSelectedTag(String paramString)
  {
    AppMethodBeat.i(107582);
    if (this.zzZ != null)
    {
      this.zzZ.setCompoundDrawables(new d(this.zzZ, paramString), null, null, null);
      this.zzZ.setHint("");
    }
    AppMethodBeat.o(107582);
  }

  public void setStatusBtnEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(107571);
    this.zAa.setEnabled(paramBoolean);
    AppMethodBeat.o(107571);
  }

  public static class ActionBarEditText extends AutoMatchKeywordEditText
  {
    private ActionBarSearchView zAl;

    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }

    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      AppMethodBeat.i(107556);
      ab.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme");
      KeyEvent.DispatcherState localDispatcherState;
      boolean bool;
      if (paramInt == 4)
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          ab.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action down");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null)
            localDispatcherState.startTracking(paramKeyEvent, this);
          AppMethodBeat.o(107556);
          bool = true;
        }
      while (true)
      {
        return bool;
        if (paramKeyEvent.getAction() == 1)
        {
          ab.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null)
            localDispatcherState.handleUpEvent(paramKeyEvent);
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            ab.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up is tracking");
            this.zAl.clearFocus();
            paramKeyEvent = (InputMethodManager)getContext().getSystemService("input_method");
            if (paramKeyEvent != null)
              paramKeyEvent.hideSoftInputFromWindow(getWindowToken(), 0);
            AppMethodBeat.o(107556);
            bool = true;
          }
        }
        else
        {
          bool = super.onKeyPreIme(paramInt, paramKeyEvent);
          AppMethodBeat.o(107556);
        }
      }
    }

    public void setSearchView(ActionBarSearchView paramActionBarSearchView)
    {
      this.zAl = paramActionBarSearchView;
    }
  }

  public static abstract interface a
  {
    public abstract void bKv();
  }

  public static abstract interface b
  {
    public abstract void Qa(String paramString);

    public abstract void apq();

    public abstract void bKt();

    public abstract void bKu();
  }

  static enum c
  {
    static
    {
      AppMethodBeat.i(107559);
      zAm = new c("CLEAR", 0);
      zAn = new c("VOICE_SEARCH", 1);
      zAo = new c[] { zAm, zAn };
      AppMethodBeat.o(107559);
    }
  }

  final class d extends Drawable
  {
    private String mText;
    private RectF nI;
    private Paint zAp;
    private int zAq;
    private float zAr;
    private float zAs;

    d(EditText paramString, String arg3)
    {
      AppMethodBeat.i(107560);
      this.zAq = BackwardSupportUtil.b.b(ah.getContext(), 2.0F);
      this.zAp = new Paint(paramString.getPaint());
      Object localObject;
      this.mText = localObject;
      this.zAp.setColor(ah.getResources().getColor(2131689776));
      this.zAr = this.zAp.measureText(this.mText);
      this$1 = this.zAp.getFontMetrics();
      this.zAs = ((float)Math.ceil(ActionBarSearchView.this.bottom - ActionBarSearchView.this.top));
      float f = this.zAs;
      setBounds(0, 0, (int)(this.zAr + this.zAq * 2 + this.zAq * 2 + 2.0F), (int)f);
      AppMethodBeat.o(107560);
    }

    public final void draw(Canvas paramCanvas)
    {
      AppMethodBeat.i(107561);
      Paint.FontMetricsInt localFontMetricsInt = this.zAp.getFontMetricsInt();
      Rect localRect = getBounds();
      int i = localRect.right;
      i = localRect.left;
      float f = this.nI.right;
      f = this.nI.left;
      int j = localRect.top;
      i = (localRect.bottom - localRect.top - localFontMetricsInt.bottom + localFontMetricsInt.top) / 2;
      int k = localFontMetricsInt.top;
      paramCanvas.drawText(this.mText, localRect.left + 2, j + i - k, this.zAp);
      AppMethodBeat.o(107561);
    }

    public final int getOpacity()
    {
      return -3;
    }

    public final void setAlpha(int paramInt)
    {
    }

    public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(107562);
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      Paint.FontMetrics localFontMetrics = this.zAp.getFontMetrics();
      float f1 = this.zAq + paramInt1;
      float f2 = paramInt2;
      this.nI = new RectF(f1, localFontMetrics.ascent - localFontMetrics.top + f2, paramInt3 - this.zAq, paramInt4);
      invalidateSelf();
      AppMethodBeat.o(107562);
    }

    public final void setColorFilter(ColorFilter paramColorFilter)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ActionBarSearchView
 * JD-Core Version:    0.6.2
 */