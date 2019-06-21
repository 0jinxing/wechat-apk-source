package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.o;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailAddrsViewControl extends RelativeLayout
{
  private static final Pattern pyE;
  private boolean gJL;
  private ak handler;
  private GestureDetector pxH;
  private MailAddrsViewControl.b pyA;
  private MailAddrsViewControl.c pyB;
  private View pyC;
  private MailAddrsViewControl.a pyD;
  private GestureDetector.SimpleOnGestureListener pyF;
  private LinkedList<o> pyy;
  AutoCompleteTextView pyz;

  static
  {
    AppMethodBeat.i(68376);
    pyE = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    AppMethodBeat.o(68376);
  }

  public MailAddrsViewControl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(68359);
    this.gJL = false;
    this.pyy = new LinkedList();
    this.handler = new ak();
    this.pyD = null;
    this.pyF = new MailAddrsViewControl.8(this);
    this.pxH = new GestureDetector(paramContext, this.pyF);
    AppMethodBeat.o(68359);
  }

  private static boolean Vs(String paramString)
  {
    AppMethodBeat.i(68371);
    boolean bool = pyE.matcher(paramString).matches();
    AppMethodBeat.o(68371);
    return bool;
  }

  private void ba(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(68374);
    paramString = paramString.trim();
    if (paramString.length() == 0)
      AppMethodBeat.o(68374);
    while (true)
    {
      return;
      Object localObject = ac.ccC().puD.Vi(paramString);
      if (((List)localObject).size() > 0)
      {
        e((o)((List)localObject).get(0));
        this.pyz.setText("");
        AppMethodBeat.o(68374);
      }
      else if (Vs(paramString))
      {
        localObject = new o();
        ((o)localObject).name = paramString;
        ((o)localObject).nJq = paramString;
        ((o)localObject).pug = 0;
        e((o)localObject);
        this.pyz.setText("");
        AppMethodBeat.o(68374);
      }
      else
      {
        if (paramBoolean)
        {
          if (this.pyD != null)
            this.pyD.ccV();
          while (true)
          {
            this.pyz.setText(paramString);
            this.pyz.setSelection(paramString.length());
            AppMethodBeat.o(68374);
            break;
            Toast.makeText(getContext(), 2131301994, 2000).show();
          }
        }
        if (this.pyD != null)
          this.pyD.b(this);
        AppMethodBeat.o(68374);
      }
    }
  }

  public final String[] a(boolean paramBoolean, d paramd)
  {
    int i = 0;
    AppMethodBeat.i(68362);
    Object localObject;
    if ((paramd != null) && (paramd.isConnected()))
      try
      {
        localObject = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        ((ReadMailProxy)localObject).<init>(paramd, null);
        paramd = (String)((ReadMailProxy)localObject).REMOTE_CALL("getUserBindEmail", new Object[0]);
        localObject = new String[this.pyy.size()];
        while (true)
        {
          if (i >= this.pyy.size())
            break label184;
          o localo = (o)this.pyy.get(i);
          if ((paramBoolean) && (localo.nJq.equalsIgnoreCase(paramd)))
            break;
          localObject[i] = (localo.name + " " + localo.nJq);
          label132: i++;
        }
      }
      catch (Exception paramd)
      {
        ab.e("MicroMsg.QQMail.MailAddrsViewControl", "getMailAddrStringArray, getUserBindEmail fail, ex = %s", new Object[] { paramd.getMessage() });
        AppMethodBeat.o(68362);
        paramd = null;
      }
    while (true)
    {
      return paramd;
      paramd = r.getUserBindEmail();
      break;
      localObject[i] = "";
      break label132;
      label184: AppMethodBeat.o(68362);
      paramd = (d)localObject;
    }
  }

  public final void b(String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(68367);
    if (paramBoolean)
    {
      removeAllViews();
      this.pyy.clear();
      cdj();
      invalidate();
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(68367);
    while (true)
    {
      return;
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        o localo = p.Vj(paramArrayOfString[j]);
        if (localo != null)
          e(localo);
      }
      AppMethodBeat.o(68367);
    }
  }

  public final void cJ(List<o> paramList)
  {
    AppMethodBeat.i(68368);
    if (paramList == null)
      AppMethodBeat.o(68368);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        e((o)paramList.next());
      AppMethodBeat.o(68368);
    }
  }

  public final boolean cdg()
  {
    boolean bool = true;
    AppMethodBeat.i(68358);
    Editable localEditable = this.pyz.getText();
    if (localEditable != null)
      if (localEditable.toString().length() <= 0)
        AppMethodBeat.o(68358);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68358);
      continue;
      AppMethodBeat.o(68358);
    }
  }

  public final boolean cdh()
  {
    AppMethodBeat.i(68363);
    String str = this.pyz.getEditableText().toString().trim();
    boolean bool;
    if ((!bo.isNullOrNil(str)) && (Vs(str)))
    {
      bool = true;
      AppMethodBeat.o(68363);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68363);
    }
  }

  public final boolean cdi()
  {
    AppMethodBeat.i(68372);
    Iterator localIterator = this.pyy.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (!Vs(((o)localIterator.next()).nJq))
      {
        bool = false;
        AppMethodBeat.o(68372);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(68372);
    }
  }

  final void cdj()
  {
    AppMethodBeat.i(68373);
    int i = getChildCount();
    int j = getMeasuredWidth();
    int k = 0;
    int m = 0;
    int n = 0;
    View localView;
    int i1;
    int i3;
    if (k < i)
    {
      localView = getChildAt(k);
      if (localView.getVisibility() == 8)
      {
        i1 = m;
        i2 = n;
        if (!(localView instanceof AutoCompleteTextView));
      }
      else
      {
        i2 = localView.getWidth();
        i3 = localView.getHeight();
        i1 = i2;
        if (i2 == 0)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
          i1 = localView.getMeasuredWidth();
        }
        if ((this.pyz == null) || (k != i - 1) || (this.pyz.isFocused()))
          break label241;
      }
    }
    label241: for (int i2 = 0; ; i2 = i1)
    {
      i1 = m;
      int i4 = n;
      if (n + i2 > j)
      {
        i1 = m + i3;
        i4 = 0;
      }
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(i4, i1, localLayoutParams.rightMargin, localLayoutParams.bottomMargin);
      localView.setLayoutParams(localLayoutParams);
      i2 = i4 + i2;
      localView.setVisibility(0);
      k++;
      m = i1;
      n = i2;
      break;
      AppMethodBeat.o(68373);
      return;
    }
  }

  public final void e(o paramo)
  {
    AppMethodBeat.i(68366);
    if (paramo == null)
    {
      AppMethodBeat.o(68366);
      return;
    }
    Object localObject1 = this.pyy.iterator();
    do
      if (!((Iterator)localObject1).hasNext())
        break;
    while (!((o)((Iterator)localObject1).next()).nJq.equalsIgnoreCase(paramo.nJq));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        Object localObject2 = (ViewGroup)View.inflate(getContext(), 2130970425, null);
        localObject1 = (Button)((ViewGroup)localObject2).findViewById(2131826692);
        ((ViewGroup)localObject2).removeView((View)((Button)localObject1).getParent());
        ((Button)localObject1).setText(paramo.name);
        if (this.gJL)
          ((Button)localObject1).setCompoundDrawables(null, null, null, null);
        ((Button)localObject1).setTag(this.pyy.size());
        localObject2 = (View)((Button)localObject1).getParent();
        ((Button)localObject1).setTag(paramo);
        ((View)localObject2).setVisibility(4);
        ((View)localObject2).setTag(paramo);
        addView((View)localObject2, this.pyy.size());
        this.pyy.add(paramo);
        this.handler.postDelayed(new MailAddrsViewControl.2(this, (Button)localObject1), 100L);
      }
      AppMethodBeat.o(68366);
      break;
    }
  }

  public final void f(o paramo)
  {
    AppMethodBeat.i(68370);
    int i = 0;
    if (i < this.pyy.size())
    {
      o localo = (o)this.pyy.get(i);
      if (paramo.nJq.equalsIgnoreCase(localo.nJq))
      {
        removeViewAt(i);
        this.pyy.remove(i);
        cdj();
        invalidate();
        AppMethodBeat.o(68370);
      }
    }
    while (true)
    {
      return;
      i++;
      break;
      AppMethodBeat.o(68370);
    }
  }

  public String getAddrsString()
  {
    AppMethodBeat.i(68364);
    if (cdh())
      ba(this.pyz.getEditableText().toString(), false);
    String str1 = "";
    for (int i = 0; i < this.pyy.size(); i++)
    {
      o localo = (o)this.pyy.get(i);
      String str2 = str1;
      if (i != 0)
        str2 = str1 + ",";
      str1 = str2 + localo.nJq;
    }
    AppMethodBeat.o(68364);
    return str1;
  }

  public LinkedList<o> getMailAddrs()
  {
    return this.pyy;
  }

  public int getSize()
  {
    AppMethodBeat.i(68365);
    int i = this.pyy.size();
    AppMethodBeat.o(68365);
    return i;
  }

  public void setAddrsAdapter(MailAddrsViewControl.b paramb)
  {
    AppMethodBeat.i(68361);
    if ((this.pyz != null) && (paramb != null))
    {
      this.pyA = paramb;
      this.pyz.setAdapter(paramb);
    }
    AppMethodBeat.o(68361);
  }

  public void setEditable(boolean paramBoolean)
  {
    AppMethodBeat.i(68360);
    this.gJL = paramBoolean;
    int i;
    Object localObject;
    if ((paramBoolean) && (this.pyz == null))
    {
      i = 0;
      if (i < getChildCount())
      {
        localObject = getChildAt(i);
        if ((localObject instanceof AutoCompleteTextView))
          this.pyz = ((AutoCompleteTextView)localObject);
      }
      else
      {
        label53: if (this.pyz == null)
          break label252;
        this.pyz.setDropDownBackgroundResource(2130839907);
        setOnClickListener(new MailAddrsViewControl.1(this));
        this.pyz.setOnItemClickListener(new MailAddrsViewControl.3(this));
        this.pyz.setOnEditorActionListener(new MailAddrsViewControl.4(this));
        this.pyz.setOnKeyListener(new MailAddrsViewControl.5(this));
        this.pyz.addTextChangedListener(new MailAddrsViewControl.6(this));
        this.pyz.setOnFocusChangeListener(new MailAddrsViewControl.7(this));
        AppMethodBeat.o(68360);
      }
    }
    while (true)
    {
      return;
      if ((localObject instanceof ViewGroup))
      {
        localObject = (ViewGroup)localObject;
        for (int j = 0; j < ((ViewGroup)localObject).getChildCount(); j++)
        {
          View localView = ((ViewGroup)localObject).getChildAt(j);
          if ((localView instanceof AutoCompleteTextView))
            this.pyz = ((AutoCompleteTextView)localView);
        }
      }
      if (this.pyz != null)
        break label53;
      i++;
      break;
      if ((!paramBoolean) && (this.pyz != null))
        this.pyz.setVisibility(8);
      label252: AppMethodBeat.o(68360);
    }
  }

  public void setInvalidMailAddrListener(MailAddrsViewControl.a parama)
  {
    this.pyD = parama;
  }

  public void setMailAdds(List<o> paramList)
  {
    AppMethodBeat.i(68369);
    if (paramList == null)
      AppMethodBeat.o(68369);
    while (true)
    {
      return;
      o localo1;
      int j;
      o localo2;
      for (int i = 0; i < this.pyy.size(); i++)
      {
        localo1 = (o)this.pyy.get(i);
        for (j = 0; j < paramList.size(); j++)
        {
          localo2 = (o)paramList.get(j);
          if (localo1.nJq.equalsIgnoreCase(localo2.nJq))
            break;
        }
        if (j == paramList.size())
          f(localo1);
      }
      for (i = 0; i < paramList.size(); i++)
      {
        localo2 = (o)paramList.get(i);
        for (j = 0; j < this.pyy.size(); j++)
        {
          localo1 = (o)this.pyy.get(j);
          if (localo2.nJq.equalsIgnoreCase(localo1.nJq))
            break;
        }
        if (j == this.pyy.size())
          e(localo2);
      }
      AppMethodBeat.o(68369);
    }
  }

  public void setOnActionListener(MailAddrsViewControl.c paramc)
  {
    this.pyB = paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl
 * JD-Core Version:    0.6.2
 */