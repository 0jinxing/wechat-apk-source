package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.f;
import android.support.v7.a.a.a;
import android.support.v7.view.c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat
  implements c
{
  static final SearchView.a arq = new SearchView.a();
  private final AdapterView.OnItemSelectedListener Up = new SearchView.10(this);
  final SearchView.SearchAutoComplete aqC;
  private final View aqD;
  final View aqE;
  private final View aqF;
  final ImageView aqG;
  final ImageView aqH;
  final ImageView aqI;
  final ImageView aqJ;
  final View aqK;
  private e aqL;
  private Rect aqM = new Rect();
  private Rect aqN = new Rect();
  private int[] aqO = new int[2];
  private int[] aqP = new int[2];
  private final ImageView aqQ;
  private final Drawable aqR;
  private final int aqS;
  private final int aqT;
  final Intent aqU;
  final Intent aqV;
  private final CharSequence aqW;
  private c aqX;
  private SearchView.b aqY;
  View.OnFocusChangeListener aqZ;
  SearchView.d ara;
  private View.OnClickListener arb;
  boolean arc;
  private boolean ard;
  f are;
  private boolean arf;
  private CharSequence arg;
  private boolean arh;
  private boolean ari;
  private boolean arj;
  private CharSequence ark;
  private CharSequence arl;
  private boolean arm;
  private int arn;
  SearchableInfo aro;
  Bundle arp;
  private final Runnable arr = new SearchView.1(this);
  private Runnable ars = new SearchView.3(this);
  private final WeakHashMap<String, Drawable.ConstantState> art = new WeakHashMap();
  View.OnKeyListener aru = new SearchView.7(this);
  private final TextView.OnEditorActionListener arv = new SearchView.8(this);
  private final AdapterView.OnItemClickListener arw = new SearchView.9(this);
  private TextWatcher arx = new SearchView.2(this);
  private int di;
  private final View.OnClickListener mOnClickListener = new SearchView.6(this);

  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772186);
  }

  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = bc.a(paramContext, paramAttributeSet, a.a.SearchView, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(paramAttributeSet.getResourceId(4, 2130968608), this, true);
    this.aqC = ((SearchView.SearchAutoComplete)findViewById(2131820950));
    this.aqC.setSearchView(this);
    this.aqD = findViewById(2131820947);
    this.aqE = findViewById(2131820949);
    this.aqF = findViewById(2131820952);
    this.aqG = ((ImageView)findViewById(2131820946));
    this.aqH = ((ImageView)findViewById(2131820953));
    this.aqI = ((ImageView)findViewById(2131820951));
    this.aqJ = ((ImageView)findViewById(2131820954));
    this.aqQ = ((ImageView)findViewById(2131820948));
    s.a(this.aqE, paramAttributeSet.getDrawable(15));
    s.a(this.aqF, paramAttributeSet.getDrawable(16));
    this.aqG.setImageDrawable(paramAttributeSet.getDrawable(10));
    this.aqH.setImageDrawable(paramAttributeSet.getDrawable(9));
    this.aqI.setImageDrawable(paramAttributeSet.getDrawable(8));
    this.aqJ.setImageDrawable(paramAttributeSet.getDrawable(12));
    this.aqQ.setImageDrawable(paramAttributeSet.getDrawable(10));
    this.aqR = paramAttributeSet.getDrawable(11);
    be.a(this.aqG, getResources().getString(2131296268));
    this.aqS = paramAttributeSet.getResourceId(14, 2130968607);
    this.aqT = paramAttributeSet.getResourceId(13, 0);
    this.aqG.setOnClickListener(this.mOnClickListener);
    this.aqI.setOnClickListener(this.mOnClickListener);
    this.aqH.setOnClickListener(this.mOnClickListener);
    this.aqJ.setOnClickListener(this.mOnClickListener);
    this.aqC.setOnClickListener(this.mOnClickListener);
    this.aqC.addTextChangedListener(this.arx);
    this.aqC.setOnEditorActionListener(this.arv);
    this.aqC.setOnItemClickListener(this.arw);
    this.aqC.setOnItemSelectedListener(this.Up);
    this.aqC.setOnKeyListener(this.aru);
    this.aqC.setOnFocusChangeListener(new SearchView.4(this));
    setIconifiedByDefault(paramAttributeSet.getBoolean(5, true));
    paramInt = paramAttributeSet.getDimensionPixelSize(1, -1);
    if (paramInt != -1)
      setMaxWidth(paramInt);
    this.aqW = paramAttributeSet.getText(7);
    this.arg = paramAttributeSet.getText(6);
    paramInt = paramAttributeSet.getInt(3, -1);
    if (paramInt != -1)
      setImeOptions(paramInt);
    paramInt = paramAttributeSet.getInt(2, -1);
    if (paramInt != -1)
      setInputType(paramInt);
    setFocusable(paramAttributeSet.getBoolean(0, true));
    paramAttributeSet.atG.recycle();
    this.aqU = new Intent("android.speech.action.WEB_SEARCH");
    this.aqU.addFlags(268435456);
    this.aqU.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.aqV = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.aqV.addFlags(268435456);
    this.aqK = findViewById(this.aqC.getDropDownAnchor());
    if (this.aqK != null)
      this.aqK.addOnLayoutChangeListener(new SearchView.5(this));
    aq(this.arc);
    kH();
  }

  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null)
      paramString1.setData(paramUri);
    paramString1.putExtra("user_query", this.arl);
    if (paramString3 != null)
      paramString1.putExtra("query", paramString3);
    if (paramString2 != null)
      paramString1.putExtra("intent_extra_data_key", paramString2);
    if (this.arp != null)
      paramString1.putExtra("app_data", this.arp);
    paramString1.setComponent(this.aro.getSearchActivity());
    return paramString1;
  }

  static boolean ac(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void aq(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i = 8;
    this.ard = paramBoolean;
    int j;
    boolean bool2;
    if (paramBoolean)
    {
      j = 0;
      if (TextUtils.isEmpty(this.aqC.getText()))
        break label129;
      bool2 = true;
      label33: this.aqG.setVisibility(j);
      ar(bool2);
      View localView = this.aqD;
      if (!paramBoolean)
        break label135;
      j = 8;
      label62: localView.setVisibility(j);
      j = i;
      if (this.aqQ.getDrawable() != null)
      {
        if (!this.arc)
          break label141;
        j = i;
      }
      label92: this.aqQ.setVisibility(j);
      kE();
      if (bool2)
        break label147;
    }
    label129: label135: label141: label147: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      as(paramBoolean);
      kD();
      return;
      j = 8;
      break;
      bool2 = false;
      break label33;
      j = 0;
      break label62;
      j = 0;
      break label92;
    }
  }

  private void ar(boolean paramBoolean)
  {
    int i = 8;
    int j = i;
    if (this.arf)
    {
      j = i;
      if (kC())
      {
        j = i;
        if (hasFocus())
          if (!paramBoolean)
          {
            j = i;
            if (this.arj);
          }
          else
          {
            j = 0;
          }
      }
    }
    this.aqH.setVisibility(j);
  }

  private void as(boolean paramBoolean)
  {
    int i;
    if ((this.arj) && (!this.ard) && (paramBoolean))
    {
      i = 0;
      this.aqH.setVisibility(8);
    }
    while (true)
    {
      this.aqJ.setVisibility(i);
      return;
      i = 8;
    }
  }

  private Intent b(Cursor paramCursor)
  {
    try
    {
      localObject1 = ax.a(paramCursor, "suggest_intent_action");
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = this.aro.getSuggestIntentAction();
      if (localObject2 == null)
      {
        localObject1 = "android.intent.action.SEARCH";
        Object localObject3 = ax.a(paramCursor, "suggest_intent_data");
        localObject2 = localObject3;
        if (localObject3 == null)
          localObject2 = this.aro.getSuggestIntentData();
        localObject3 = localObject2;
        if (localObject2 != null)
        {
          String str = ax.a(paramCursor, "suggest_intent_data_id");
          localObject3 = localObject2;
          if (str != null)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = (String)localObject2 + "/" + Uri.encode(str);
          }
        }
        if (localObject3 == null);
        for (localObject2 = null; ; localObject2 = Uri.parse((String)localObject3))
        {
          localObject3 = ax.a(paramCursor, "suggest_intent_query");
          localObject2 = a((String)localObject1, (Uri)localObject2, ax.a(paramCursor, "suggest_intent_extra_data"), (String)localObject3);
          paramCursor = (Cursor)localObject2;
          return paramCursor;
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        try
        {
          i = paramCursor.getPosition();
          new StringBuilder("Search suggestions cursor at row ").append(i).append(" returned exception.");
          paramCursor = null;
        }
        catch (RuntimeException paramCursor)
        {
          int i = -1;
          continue;
        }
        Object localObject1 = localRuntimeException;
      }
    }
  }

  private boolean cz(int paramInt)
  {
    Cursor localCursor = this.are.getCursor();
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt)))
      d(b(localCursor));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void d(Intent paramIntent)
  {
    if (paramIntent == null);
    while (true)
    {
      return;
      try
      {
        getContext().startActivity(paramIntent);
      }
      catch (RuntimeException localRuntimeException)
      {
        new StringBuilder("Failed launch activity: ").append(paramIntent);
      }
    }
  }

  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(2131427959);
  }

  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(2131427960);
  }

  private boolean kC()
  {
    if (((this.arf) || (this.arj)) && (!this.ard));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void kD()
  {
    int i = 8;
    int j = i;
    if (kC())
      if (this.aqH.getVisibility() != 0)
      {
        j = i;
        if (this.aqJ.getVisibility() != 0);
      }
      else
      {
        j = 0;
      }
    this.aqF.setVisibility(j);
  }

  private void kE()
  {
    int i = 1;
    int j = 0;
    int k;
    int m;
    label43: label57: Drawable localDrawable;
    if (!TextUtils.isEmpty(this.aqC.getText()))
    {
      k = 1;
      m = i;
      if (k == 0)
      {
        if ((!this.arc) || (this.arm))
          break label101;
        m = i;
      }
      localObject = this.aqI;
      if (m == 0)
        break label107;
      m = j;
      ((ImageView)localObject).setVisibility(m);
      localDrawable = this.aqI.getDrawable();
      if (localDrawable != null)
        if (k == 0)
          break label114;
    }
    label101: label107: label114: for (Object localObject = ENABLED_STATE_SET; ; localObject = EMPTY_STATE_SET)
    {
      localDrawable.setState((int[])localObject);
      return;
      k = 0;
      break;
      m = 0;
      break label43;
      m = 8;
      break label57;
    }
  }

  private void kF()
  {
    post(this.arr);
  }

  private void kH()
  {
    CharSequence localCharSequence = getQueryHint();
    SearchView.SearchAutoComplete localSearchAutoComplete = this.aqC;
    Object localObject = localCharSequence;
    if (localCharSequence == null)
      localObject = "";
    localSearchAutoComplete.setHint(l((CharSequence)localObject));
  }

  private CharSequence l(CharSequence paramCharSequence)
  {
    Object localObject = paramCharSequence;
    if (this.arc)
    {
      if (this.aqR != null)
        break label20;
      localObject = paramCharSequence;
    }
    while (true)
    {
      return localObject;
      label20: int i = (int)(this.aqC.getTextSize() * 1.25D);
      this.aqR.setBounds(0, 0, i, i);
      localObject = new SpannableStringBuilder("   ");
      ((SpannableStringBuilder)localObject).setSpan(new ImageSpan(this.aqR), 1, 2, 33);
      ((SpannableStringBuilder)localObject).append(paramCharSequence);
    }
  }

  final void U(String paramString)
  {
    paramString = a("android.intent.action.SEARCH", null, null, paramString);
    getContext().startActivity(paramString);
  }

  final boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.aro == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (this.are != null)
      {
        bool2 = bool1;
        if (paramKeyEvent.getAction() == 0)
        {
          bool2 = bool1;
          if (paramKeyEvent.hasNoModifiers())
            if ((paramInt == 66) || (paramInt == 84) || (paramInt == 61))
            {
              bool2 = cy(this.aqC.getListSelection());
            }
            else
            {
              if ((paramInt == 21) || (paramInt == 22))
              {
                if (paramInt == 21);
                for (paramInt = 0; ; paramInt = this.aqC.length())
                {
                  this.aqC.setSelection(paramInt);
                  this.aqC.setListSelection(0);
                  this.aqC.clearListSelection();
                  arq.c(this.aqC);
                  bool2 = true;
                  break;
                }
              }
              bool2 = bool1;
              if (paramInt == 19)
              {
                bool2 = bool1;
                if (this.aqC.getListSelection() == 0)
                  bool2 = bool1;
              }
            }
        }
      }
    }
  }

  public void clearFocus()
  {
    this.ari = true;
    super.clearFocus();
    this.aqC.clearFocus();
    SearchView.SearchAutoComplete.a(this.aqC, false);
    this.ari = false;
  }

  final boolean cy(int paramInt)
  {
    boolean bool = false;
    if ((this.ara == null) || (!this.ara.kP()))
    {
      cz(paramInt);
      SearchView.SearchAutoComplete.a(this.aqC, false);
      this.aqC.dismissDropDown();
      bool = true;
    }
    return bool;
  }

  public int getImeOptions()
  {
    return this.aqC.getImeOptions();
  }

  public int getInputType()
  {
    return this.aqC.getInputType();
  }

  public int getMaxWidth()
  {
    return this.di;
  }

  public CharSequence getQuery()
  {
    return this.aqC.getText();
  }

  public CharSequence getQueryHint()
  {
    CharSequence localCharSequence;
    if (this.arg != null)
      localCharSequence = this.arg;
    while (true)
    {
      return localCharSequence;
      if ((this.aro != null) && (this.aro.getHintId() != 0))
        localCharSequence = getContext().getText(this.aro.getHintId());
      else
        localCharSequence = this.aqW;
    }
  }

  int getSuggestionCommitIconResId()
  {
    return this.aqT;
  }

  int getSuggestionRowLayout()
  {
    return this.aqS;
  }

  public f getSuggestionsAdapter()
  {
    return this.are;
  }

  final void kG()
  {
    if (this.aqC.hasFocus());
    for (int[] arrayOfInt = FOCUSED_STATE_SET; ; arrayOfInt = EMPTY_STATE_SET)
    {
      Drawable localDrawable = this.aqE.getBackground();
      if (localDrawable != null)
        localDrawable.setState(arrayOfInt);
      localDrawable = this.aqF.getBackground();
      if (localDrawable != null)
        localDrawable.setState(arrayOfInt);
      invalidate();
      return;
    }
  }

  final void kI()
  {
    Editable localEditable = this.aqC.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0))
      if (this.aqX != null)
      {
        c localc = this.aqX;
        localEditable.toString();
        if (localc.kN());
      }
      else
      {
        if (this.aro != null)
          U(localEditable.toString());
        SearchView.SearchAutoComplete.a(this.aqC, false);
        this.aqC.dismissDropDown();
      }
  }

  final void kJ()
  {
    if (TextUtils.isEmpty(this.aqC.getText()))
      if ((this.arc) && ((this.aqY == null) || (!this.aqY.onClose())))
      {
        clearFocus();
        aq(true);
      }
    while (true)
    {
      return;
      this.aqC.setText("");
      this.aqC.requestFocus();
      SearchView.SearchAutoComplete.a(this.aqC, true);
    }
  }

  final void kK()
  {
    aq(false);
    this.aqC.requestFocus();
    SearchView.SearchAutoComplete.a(this.aqC, true);
    if (this.arb != null)
      this.arb.onClick(this);
  }

  final void kL()
  {
    aq(this.ard);
    kF();
    if (this.aqC.hasFocus())
      kM();
  }

  final void kM()
  {
    arq.a(this.aqC);
    arq.b(this.aqC);
  }

  final void m(CharSequence paramCharSequence)
  {
    boolean bool1 = true;
    Editable localEditable = this.aqC.getText();
    this.arl = localEditable;
    if (!TextUtils.isEmpty(localEditable))
    {
      bool2 = true;
      ar(bool2);
      if (bool2)
        break label95;
    }
    label95: for (boolean bool2 = bool1; ; bool2 = false)
    {
      as(bool2);
      kE();
      kD();
      if ((this.aqX != null) && (!TextUtils.equals(paramCharSequence, this.ark)))
        paramCharSequence.toString();
      this.ark = paramCharSequence.toString();
      return;
      bool2 = false;
      break;
    }
  }

  public final void onActionViewCollapsed()
  {
    this.aqC.setText("");
    this.aqC.setSelection(this.aqC.length());
    this.arl = "";
    clearFocus();
    aq(true);
    this.aqC.setImeOptions(this.arn);
    this.arm = false;
  }

  public final void onActionViewExpanded()
  {
    if (this.arm);
    while (true)
    {
      return;
      this.arm = true;
      this.arn = this.aqC.getImeOptions();
      this.aqC.setImeOptions(this.arn | 0x2000000);
      this.aqC.setText("");
      setIconified(false);
    }
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.arr);
    post(this.ars);
    super.onDetachedFromWindow();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      SearchView.SearchAutoComplete localSearchAutoComplete = this.aqC;
      Rect localRect = this.aqM;
      localSearchAutoComplete.getLocationInWindow(this.aqO);
      getLocationInWindow(this.aqP);
      paramInt1 = this.aqO[1] - this.aqP[1];
      paramInt3 = this.aqO[0] - this.aqP[0];
      localRect.set(paramInt3, paramInt1, localSearchAutoComplete.getWidth() + paramInt3, localSearchAutoComplete.getHeight() + paramInt1);
      this.aqN.set(this.aqM.left, 0, this.aqM.right, paramInt4 - paramInt2);
      if (this.aqL != null)
        break label161;
      this.aqL = new e(this.aqN, this.aqM, this.aqC);
      setTouchDelegate(this.aqL);
    }
    while (true)
    {
      return;
      label161: this.aqL.c(this.aqN, this.aqM);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.ard)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    switch (i)
    {
    default:
      paramInt1 = j;
      label63: j = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      switch (j)
      {
      default:
      case -2147483648:
      case 0:
      }
      break;
    case -2147483648:
    case 1073741824:
    case 0:
    }
    while (true)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      break;
      if (this.di > 0)
      {
        paramInt1 = Math.min(this.di, j);
        break label63;
      }
      paramInt1 = Math.min(getPreferredWidth(), j);
      break label63;
      paramInt1 = j;
      if (this.di <= 0)
        break label63;
      paramInt1 = Math.min(this.di, j);
      break label63;
      if (this.di > 0)
      {
        paramInt1 = this.di;
        break label63;
      }
      paramInt1 = getPreferredWidth();
      break label63;
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
      continue;
      paramInt2 = getPreferredHeight();
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SearchView.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (SearchView.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      aq(paramParcelable.arC);
      requestLayout();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SearchView.SavedState localSavedState = new SearchView.SavedState(super.onSaveInstanceState());
    localSavedState.arC = this.ard;
    return localSavedState;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    kF();
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool = false;
    if (this.ari);
    while (true)
    {
      return bool;
      if (isFocusable())
        if (!this.ard)
        {
          bool = this.aqC.requestFocus(paramInt, paramRect);
          if (bool)
            aq(false);
        }
        else
        {
          bool = super.requestFocus(paramInt, paramRect);
        }
    }
  }

  public void setAppSearchData(Bundle paramBundle)
  {
    this.arp = paramBundle;
  }

  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean)
      kJ();
    while (true)
    {
      return;
      kK();
    }
  }

  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (this.arc == paramBoolean);
    while (true)
    {
      return;
      this.arc = paramBoolean;
      aq(paramBoolean);
      kH();
    }
  }

  public void setImeOptions(int paramInt)
  {
    this.aqC.setImeOptions(paramInt);
  }

  public void setInputType(int paramInt)
  {
    this.aqC.setInputType(paramInt);
  }

  public void setMaxWidth(int paramInt)
  {
    this.di = paramInt;
    requestLayout();
  }

  public void setOnCloseListener(SearchView.b paramb)
  {
    this.aqY = paramb;
  }

  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.aqZ = paramOnFocusChangeListener;
  }

  public void setOnQueryTextListener(c paramc)
  {
    this.aqX = paramc;
  }

  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.arb = paramOnClickListener;
  }

  public void setOnSuggestionListener(SearchView.d paramd)
  {
    this.ara = paramd;
  }

  void setQuery(CharSequence paramCharSequence)
  {
    this.aqC.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.aqC;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i = 0; ; i = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i);
      return;
    }
  }

  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.arg = paramCharSequence;
    kH();
  }

  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.arh = paramBoolean;
    ax localax;
    if ((this.are instanceof ax))
    {
      localax = (ax)this.are;
      if (!paramBoolean)
        break label35;
    }
    label35: for (int i = 2; ; i = 1)
    {
      localax.asC = i;
      return;
    }
  }

  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    boolean bool = true;
    this.aro = paramSearchableInfo;
    int j;
    if (this.aro != null)
    {
      this.aqC.setThreshold(this.aro.getSuggestThreshold());
      this.aqC.setImeOptions(this.aro.getImeOptions());
      int i = this.aro.getInputType();
      j = i;
      if ((i & 0xF) == 1)
      {
        i &= -65537;
        j = i;
        if (this.aro.getSuggestAuthority() != null)
          j = i | 0x10000 | 0x80000;
      }
      this.aqC.setInputType(j);
      if (this.are != null)
        this.are.changeCursor(null);
      if (this.aro.getSuggestAuthority() != null)
      {
        this.are = new ax(getContext(), this, this.aro, this.art);
        this.aqC.setAdapter(this.are);
        paramSearchableInfo = (ax)this.are;
        if (this.arh)
        {
          j = 2;
          paramSearchableInfo.asC = j;
        }
      }
      else
      {
        kH();
      }
    }
    else
    {
      if ((this.aro == null) || (!this.aro.getVoiceSearchEnabled()))
        break label301;
      if (!this.aro.getVoiceSearchLaunchWebSearch())
        break label278;
      paramSearchableInfo = this.aqU;
    }
    while (true)
    {
      label220: if (paramSearchableInfo != null)
        if (getContext().getPackageManager().resolveActivity(paramSearchableInfo, 65536) == null);
      while (true)
      {
        this.arj = bool;
        if (this.arj)
          this.aqC.setPrivateImeOptions("nm");
        aq(this.ard);
        return;
        j = 1;
        break;
        label278: if (!this.aro.getVoiceSearchLaunchRecognizer())
          break label306;
        paramSearchableInfo = this.aqV;
        break label220;
        bool = false;
        continue;
        label301: bool = false;
      }
      label306: paramSearchableInfo = null;
    }
  }

  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.arf = paramBoolean;
    aq(this.ard);
  }

  public void setSuggestionsAdapter(f paramf)
  {
    this.are = paramf;
    this.aqC.setAdapter(this.are);
  }

  public static abstract interface c
  {
    public abstract boolean kN();
  }

  static final class e extends TouchDelegate
  {
    private final View arH;
    private final Rect arI;
    private final Rect arJ;
    private final Rect arK;
    private final int arL;
    private boolean arM;

    public e(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      this.arL = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      this.arI = new Rect();
      this.arK = new Rect();
      this.arJ = new Rect();
      c(paramRect1, paramRect2);
      this.arH = paramView;
    }

    public final void c(Rect paramRect1, Rect paramRect2)
    {
      this.arI.set(paramRect1);
      this.arK.set(paramRect1);
      this.arK.inset(-this.arL, -this.arL);
      this.arJ.set(paramRect2);
    }

    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool1 = false;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k;
      boolean bool2;
      label54: boolean bool3;
      switch (paramMotionEvent.getAction())
      {
      default:
        k = 1;
        bool2 = false;
        bool3 = bool1;
        if (bool2)
        {
          if ((k == 0) || (this.arJ.contains(i, j)))
            break label203;
          paramMotionEvent.setLocation(this.arH.getWidth() / 2, this.arH.getHeight() / 2);
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        bool3 = this.arH.dispatchTouchEvent(paramMotionEvent);
        return bool3;
        if (!this.arI.contains(i, j))
          break;
        this.arM = true;
        k = 1;
        bool2 = true;
        break label54;
        bool3 = this.arM;
        bool2 = bool3;
        if (bool3)
        {
          bool2 = bool3;
          if (!this.arK.contains(i, j))
          {
            k = 0;
            bool2 = bool3;
            break label54;
            bool2 = this.arM;
            this.arM = false;
          }
        }
        k = 1;
        break label54;
        label203: paramMotionEvent.setLocation(i - this.arJ.left, j - this.arJ.top);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.6.2
 */