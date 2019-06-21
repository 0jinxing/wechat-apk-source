package com.tencent.mm.plugin.recharge.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils.TruncateAt;
import android.text.method.KeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public class MallEditText extends LinearLayout
  implements View.OnFocusChangeListener
{
  private View.OnFocusChangeListener gJD;
  private ImageView gJG;
  private String gJH;
  private String gJI;
  private int gJJ;
  public boolean gJL;
  private boolean gJN;
  private int gJO;
  private int gJP;
  private TextView goa;
  private int gravity;
  private boolean hNO;
  private int imeOptions;
  private int inputType;
  private int pGA;
  private MallEditText.b pGs;
  AutoCompleteTextView pGt;
  boolean pGu;
  private a pGv;
  private List<String[]> pGw;
  private com.tencent.mm.plugin.recharge.model.a pGx;
  private Runnable pGy;
  private boolean pGz;

  public MallEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MallEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44227);
    this.pGv = null;
    this.gJH = "";
    this.gJI = "";
    this.inputType = 1;
    this.hNO = true;
    this.gJP = -1;
    this.gJO = 1;
    this.gravity = 19;
    this.gJJ = -1;
    this.gJN = false;
    this.pGx = null;
    this.gJL = true;
    this.pGy = null;
    this.pGz = false;
    this.pGA = 0;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MallEditText, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(6, 0);
    if (paramInt != 0)
      this.gJH = paramContext.getString(paramInt);
    paramInt = paramAttributeSet.getResourceId(7, 0);
    if (paramInt != 0)
      this.gJI = paramContext.getString(paramInt);
    this.inputType = paramAttributeSet.getInteger(4, 1);
    this.gJL = paramAttributeSet.getBoolean(3, true);
    this.gravity = paramAttributeSet.getInt(0, 19);
    this.hNO = paramAttributeSet.getBoolean(1, true);
    this.gJP = paramAttributeSet.getInteger(2, -1);
    this.gJJ = paramAttributeSet.getInteger(8, 0);
    this.imeOptions = paramAttributeSet.getInteger(5, 5);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130970469, this, true);
    this.goa = ((TextView)paramAttributeSet.findViewById(2131826877));
    this.pGt = ((AutoCompleteTextView)paramAttributeSet.findViewById(2131821052));
    if (com.tencent.mm.bz.a.ga(paramContext))
    {
      this.pGt.setTextSize(0, paramContext.getResources().getDimensionPixelSize(2131427813) * 1.25F);
      label284: this.gJG = ((ImageView)paramAttributeSet.findViewById(2131821053));
      ab.d("MicroMsg.MallEditText", "setFormat editType:" + this.gJJ);
      this.pGt.setImeOptions(this.imeOptions);
      switch (this.gJJ)
      {
      default:
        label360: this.inputType = 1;
        label365: this.pGt.addTextChangedListener(new MallEditText.1(this));
        this.pGt.setOnFocusChangeListener(this);
        if (!bo.isNullOrNil(this.gJH))
          this.pGt.setHint(this.gJH);
        if (this.inputType == 2)
        {
          this.pGt.setKeyListener(new MallEditText.2(this));
          label432: this.pGt.setGravity(this.gravity);
          if (!this.hNO)
          {
            this.pGt.setEnabled(false);
            this.pGt.setTextColor(getResources().getColor(2131689761));
            this.pGt.setFocusable(false);
            this.pGt.setClickable(false);
          }
          if (this.gJL)
            break label720;
          this.gJN = true;
          this.pGt.setEnabled(false);
          this.pGt.setFocusable(false);
          this.pGt.setClickable(false);
        }
        break;
      case 1:
      case 0:
      }
    }
    while (true)
    {
      if (this.gJP != -1)
        this.pGt.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.gJP) });
      ab.d("MicroMsg.MallEditText", "initData editType:" + this.gJJ);
      switch (this.gJJ)
      {
      default:
        AppMethodBeat.o(44227);
        return;
        this.pGt.setTextSize(0, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        break label284;
        this.gJO = 13;
        this.gJP = 13;
        this.inputType = 2;
        setInfoTvImageResource(2130840001);
        this.gJG.setVisibility(0);
        break label365;
        if (this.gJL)
          break label360;
        this.gJG.setImageResource(2130839547);
        this.gJG.setVisibility(0);
        break label360;
        this.pGt.setInputType(this.inputType);
        this.pGt.setRawInputType(this.inputType);
        break label432;
        label720: this.gJN = false;
      case 1:
      }
    }
    ab.d("MicroMsg.MallEditText", "setMobileEditTv");
    paramContext = com.tencent.mm.plugin.recharge.a.a.cea().ceb();
    this.pGv = new a((byte)0);
    this.pGv.cK(paramContext);
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      this.pGx = ((com.tencent.mm.plugin.recharge.model.a)paramContext.get(0));
      setInput(this.pGx);
    }
    while (true)
    {
      if ((paramContext == null) || (paramContext.size() == 0))
      {
        g.RQ();
        paramContext = (String)g.RP().Ry().get(6, null);
        this.pGt.setText(paramContext);
        this.pGt.setSelection(this.pGt.getText().length());
        cee();
      }
      this.pGt.setAdapter(this.pGv);
      this.pGt.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(44210);
          MallEditText.a(MallEditText.this, MallEditText.d(MallEditText.this).BA(paramAnonymousInt));
          if (MallEditText.e(MallEditText.this) != null)
          {
            ab.d("MicroMsg.MallEditText", "onItemClick record.record " + MallEditText.e(MallEditText.this).pFM + ", record.name " + MallEditText.e(MallEditText.this).name);
            MallEditText.this.setInput(MallEditText.e(MallEditText.this));
          }
          MallEditText.a(MallEditText.this).dismissDropDown();
          AppMethodBeat.o(44210);
        }
      });
      break;
      if (this.pGw == null)
        new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(44209);
            try
            {
              MallEditText.a(MallEditText.this, com.tencent.mm.pluginsdk.a.cJ(MallEditText.this.getContext()));
              AppMethodBeat.o(44209);
              return;
            }
            catch (Exception localException)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.MallEditText", localException, "", new Object[0]);
                AppMethodBeat.o(44209);
              }
            }
          }
        }
        .run();
    }
  }

  private void cee()
  {
    AppMethodBeat.i(44233);
    boolean bool = asa();
    if (bool != this.gJN)
    {
      ab.d("MicroMsg.MallEditText", "View:" + this.gJI + ", editType:" + this.gJJ + " inputValid change to " + bool);
      this.gJN = bool;
      if (this.pGs != null)
        this.pGs.hY(this.gJN);
      if (!bool)
      {
        if (this.goa.getVisibility() == 0)
        {
          this.goa.setText("");
          this.goa.setVisibility(8);
        }
        this.pGx = null;
      }
    }
    if (this.pGs != null)
      this.pGs.ceg();
    AppMethodBeat.o(44233);
  }

  private void setInputForce(com.tencent.mm.plugin.recharge.model.a parama)
  {
    AppMethodBeat.i(44232);
    this.pGx = parama;
    if (parama != null)
    {
      KeyListener localKeyListener = this.pGt.getKeyListener();
      this.pGt.setKeyListener(null);
      this.pGt.setText(parama.pFM);
      this.pGt.setSelection(this.pGt.getText().length());
      this.pGt.setKeyListener(localKeyListener);
      cee();
      ab.d("MicroMsg.MallEditText", "editTv.setText " + parama.pFM + ", name " + parama.name + ", isInputValid " + this.gJN);
      if ((!bo.isNullOrNil(parama.name)) && (this.gJN))
      {
        this.goa.setText(parama.name);
        this.goa.setVisibility(0);
        AppMethodBeat.o(44232);
      }
    }
    while (true)
    {
      return;
      this.goa.setText("");
      this.goa.setVisibility(8);
      AppMethodBeat.o(44232);
      continue;
      this.pGt.setText("");
      cee();
      ab.d("MicroMsg.MallEditText", "editTv.setText null");
      this.goa.setText("");
      this.goa.setVisibility(8);
      AppMethodBeat.o(44232);
    }
  }

  public final boolean asa()
  {
    boolean bool = true;
    AppMethodBeat.i(44235);
    switch (this.gJJ)
    {
    default:
      if (this.pGt.getText().length() >= this.gJO)
        AppMethodBeat.o(44235);
      break;
    case 1:
    }
    while (true)
    {
      return bool;
      String str = this.pGt.getText().toString();
      if ((str.length() >= this.gJO) && (str.length() <= this.gJP) && (PhoneNumberUtils.isGlobalPhoneNumber(b.ws(str))))
      {
        AppMethodBeat.o(44235);
      }
      else
      {
        AppMethodBeat.o(44235);
        bool = false;
        continue;
        AppMethodBeat.o(44235);
        bool = false;
      }
    }
  }

  public final boolean cef()
  {
    boolean bool = false;
    AppMethodBeat.i(44237);
    if (getVisibility() == 0)
      if (bo.isNullOrNil(getText()))
      {
        ab.d("MicroMsg.MallEditText", "View:" + this.gJI + ", editType:" + this.gJJ + " checkInputValid : empty ");
        AppMethodBeat.o(44237);
      }
    while (true)
    {
      return bool;
      if (this.gJN)
      {
        AppMethodBeat.o(44237);
        bool = true;
      }
      else
      {
        ab.d("MicroMsg.MallEditText", "View:" + this.gJI + ", editType:" + this.gJJ + " checkInputValid : illegal ");
        AppMethodBeat.o(44237);
        continue;
        AppMethodBeat.o(44237);
        bool = true;
      }
    }
  }

  public void getFocus()
  {
    AppMethodBeat.i(44244);
    this.pGt.findFocus();
    AppMethodBeat.o(44244);
  }

  public com.tencent.mm.plugin.recharge.model.a getInputRecord()
  {
    AppMethodBeat.i(44243);
    com.tencent.mm.plugin.recharge.model.a locala;
    if (this.pGx != null)
    {
      locala = this.pGx;
      AppMethodBeat.o(44243);
    }
    while (true)
    {
      return locala;
      this.pGx = new com.tencent.mm.plugin.recharge.model.a(getText(), this.goa.getText().toString(), 0);
      locala = this.pGx;
      AppMethodBeat.o(44243);
    }
  }

  public String getText()
  {
    AppMethodBeat.i(44234);
    String str;
    switch (this.gJJ)
    {
    default:
      str = bo.bc(this.pGt.getText().toString(), "");
      AppMethodBeat.o(44234);
    case 1:
    }
    while (true)
    {
      return str;
      str = bo.bc(this.pGt.getText().toString(), "");
      AppMethodBeat.o(44234);
    }
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(44240);
    if (this.gJD != null)
      this.gJD.onFocusChange(this, paramBoolean);
    if (!this.pGz);
    for (boolean bool = true; ; bool = false)
    {
      if ((bool == paramBoolean) && (!paramBoolean) && (this.pGy != null))
        this.pGy.run();
      this.pGz = paramBoolean;
      ab.d("MicroMsg.MallEditText", "View:" + this.gJI + ", editType:" + this.gJJ + " onFocusChange to " + paramBoolean);
      if (this.pGs != null)
        this.pGs.hY(this.gJN);
      AppMethodBeat.o(44240);
      return;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.gJL);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(44236);
    this.pGt.setEllipsize(paramTruncateAt);
    AppMethodBeat.o(44236);
  }

  public void setHintStr(String paramString)
  {
    AppMethodBeat.i(44228);
    this.pGt.setHint(paramString);
    AppMethodBeat.o(44228);
  }

  public void setImeOptions(int paramInt)
  {
    AppMethodBeat.i(44241);
    this.pGt.setImeOptions(paramInt);
    AppMethodBeat.o(44241);
  }

  public void setInfoTvImageResource(int paramInt)
  {
    AppMethodBeat.i(44230);
    if (paramInt == 2130839158);
    for (boolean bool = true; ; bool = false)
    {
      this.pGu = bool;
      this.gJG.setImageResource(paramInt);
      AppMethodBeat.o(44230);
      return;
    }
  }

  public void setInfoTvOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(44229);
    this.gJG.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(44229);
  }

  public void setInput(com.tencent.mm.plugin.recharge.model.a parama)
  {
    AppMethodBeat.i(44231);
    this.pGx = parama;
    if (parama != null)
    {
      this.pGt.setText(parama.pFM);
      this.pGt.setSelection(this.pGt.getText().length());
      cee();
      ab.d("MicroMsg.MallEditText", "editTv.setText " + parama.pFM + ", name " + parama.name + ", isInputValid " + this.gJN);
      if ((!bo.isNullOrNil(parama.name)) && (this.gJN))
      {
        this.goa.setText(parama.name);
        this.goa.setVisibility(0);
        AppMethodBeat.o(44231);
      }
    }
    while (true)
    {
      return;
      this.goa.setText("");
      this.goa.setVisibility(8);
      AppMethodBeat.o(44231);
      continue;
      this.pGt.setText("");
      cee();
      ab.d("MicroMsg.MallEditText", "editTv.setText null");
      this.goa.setText("");
      this.goa.setVisibility(8);
      AppMethodBeat.o(44231);
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(44238);
    super.setOnClickListener(paramOnClickListener);
    this.pGt.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(44238);
  }

  public void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    AppMethodBeat.i(44242);
    this.pGt.setOnEditorActionListener(paramOnEditorActionListener);
    AppMethodBeat.o(44242);
  }

  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    AppMethodBeat.i(44239);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.gJD = paramOnFocusChangeListener;
    AppMethodBeat.o(44239);
  }

  public void setOnInputValidChangeListener(MallEditText.b paramb)
  {
    this.pGs = paramb;
  }

  final class a extends BaseAdapter
    implements Filterable
  {
    public List<com.tencent.mm.plugin.recharge.model.a> pGC;
    public boolean pGD;
    private List<com.tencent.mm.plugin.recharge.model.a> pGE;
    private MallEditText.a.a pGF;
    private String pGG;

    private a()
    {
      AppMethodBeat.i(44219);
      this.pGC = new ArrayList();
      this.pGD = false;
      AppMethodBeat.o(44219);
    }

    public final com.tencent.mm.plugin.recharge.model.a BA(int paramInt)
    {
      com.tencent.mm.plugin.recharge.model.a locala1 = null;
      while (true)
      {
        try
        {
          AppMethodBeat.i(44223);
          if (!this.pGD)
            break label79;
          if (paramInt == 0)
          {
            AppMethodBeat.o(44223);
            return locala1;
          }
          if (paramInt <= this.pGC.size())
          {
            locala1 = (com.tencent.mm.plugin.recharge.model.a)this.pGC.get(paramInt - 1);
            AppMethodBeat.o(44223);
            continue;
          }
        }
        finally
        {
        }
        AppMethodBeat.o(44223);
        continue;
        label79: if (paramInt < this.pGC.size())
        {
          com.tencent.mm.plugin.recharge.model.a locala2 = (com.tencent.mm.plugin.recharge.model.a)this.pGC.get(paramInt);
          AppMethodBeat.o(44223);
        }
        else
        {
          AppMethodBeat.o(44223);
        }
      }
    }

    public final void cK(List<com.tencent.mm.plugin.recharge.model.a> paramList)
    {
      AppMethodBeat.i(44220);
      this.pGE = paramList;
      this.pGC.clear();
      this.pGD = false;
      AppMethodBeat.o(44220);
    }

    public final int getCount()
    {
      AppMethodBeat.i(44222);
      int i;
      if (this.pGD)
      {
        i = this.pGC.size() + 2;
        AppMethodBeat.o(44222);
      }
      while (true)
      {
        return i;
        if (this.pGC.size() > 0)
        {
          i = this.pGC.size() + 1;
          AppMethodBeat.o(44222);
        }
        else
        {
          i = 0;
          AppMethodBeat.o(44222);
        }
      }
    }

    public final Filter getFilter()
    {
      AppMethodBeat.i(44221);
      ab.d("MicroMsg.MallEditText", "getFilter");
      if (this.pGF == null)
        this.pGF = new MallEditText.a.a(this, (byte)0);
      MallEditText.a.a locala = this.pGF;
      AppMethodBeat.o(44221);
      return locala;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final int getItemViewType(int paramInt)
    {
      int i = 0;
      AppMethodBeat.i(44225);
      if (this.pGD)
        if (paramInt == 0)
        {
          paramInt = 2;
          AppMethodBeat.o(44225);
        }
      while (true)
      {
        return paramInt;
        if (paramInt <= this.pGC.size())
        {
          AppMethodBeat.o(44225);
          paramInt = i;
        }
        else
        {
          paramInt = 3;
          AppMethodBeat.o(44225);
          continue;
          if (paramInt < this.pGC.size())
          {
            AppMethodBeat.o(44225);
            paramInt = i;
          }
          else
          {
            paramInt = 1;
            AppMethodBeat.o(44225);
          }
        }
      }
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(44224);
      switch (getItemViewType(paramInt))
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while (true)
      {
        AppMethodBeat.o(44224);
        return paramView;
        MallEditText.c localc;
        com.tencent.mm.plugin.recharge.model.a locala;
        int j;
        label235: int k;
        if (paramView == null)
        {
          paramViewGroup = View.inflate(MallEditText.this.getContext(), 2130970472, null);
          localc = new MallEditText.c(MallEditText.this, (byte)0);
          localc.pGK = ((TextView)paramViewGroup.findViewById(2131826879));
          localc.gtb = ((TextView)paramViewGroup.findViewById(2131826880));
          paramViewGroup.setTag(localc);
          locala = BA(paramInt);
          paramView = paramViewGroup;
          if (locala != null)
          {
            paramView = paramViewGroup;
            if (localc != null)
            {
              paramView = paramViewGroup;
              if (localc.pGK != null)
              {
                paramView = paramViewGroup;
                if (localc.gtb != null)
                {
                  paramView = b.VB(locala.pFM);
                  ab.d("MicroMsg.MallEditText", "record.record " + paramView + ", record.name " + locala.name);
                  if (!com.tencent.mm.plugin.recharge.model.a.pFK.equals(locala.pFO))
                  {
                    paramView = new SpannableStringBuilder(paramView);
                    int[] arrayOfInt = locala.pFO;
                    int i = arrayOfInt.length;
                    j = 0;
                    if (j < i)
                    {
                      k = arrayOfInt[j];
                      if (k >= 0)
                      {
                        if (k < 7)
                          break label305;
                        paramInt = k + 2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else
        {
          while (true)
          {
            paramView.setSpan(new ForegroundColorSpan(-65536), paramInt, paramInt + 1, 34);
            j++;
            break label235;
            localc = (MallEditText.c)paramView.getTag();
            paramViewGroup = paramView;
            break;
            label305: paramInt = k;
            if (k >= 3)
              paramInt = k + 1;
          }
          localc.pGK.setText(paramView);
          label331: if ((locala.name != null) && (!bo.isNullOrNil(locala.name.trim())))
            localc.gtb.setText(MallEditText.this.getResources().getString(2131301395, new Object[] { locala.name }));
          while (true)
          {
            paramViewGroup.setBackgroundResource(2130838396);
            paramView = paramViewGroup;
            break;
            localc.pGK.setText(paramView);
            break label331;
            localc.gtb.setText("");
          }
          paramView = View.inflate(MallEditText.this.getContext(), 2130970471, null);
          paramView.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(44211);
              MallEditText.a(MallEditText.this).dismissDropDown();
              AppMethodBeat.o(44211);
            }
          });
          continue;
          paramView = View.inflate(MallEditText.this.getContext(), 2130970473, null);
          paramView.setOnClickListener(new MallEditText.a.2(this));
          continue;
          paramView = View.inflate(MallEditText.this.getContext(), 2130970473, null);
          ((TextView)paramView).setText(2131301384);
          paramView.setOnClickListener(new MallEditText.a.3(this));
        }
      }
    }

    public final int getViewTypeCount()
    {
      return 4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.MallEditText
 * JD-Core Version:    0.6.2
 */