package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.util.o;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class p
{
  private static Class<?>[] vsU;
  private static final f<String, SpannableString> vsy;
  String hcl;
  private Context mContext;
  private TextView sW;
  private ArrayList<p.a> vsA;
  private ArrayList<r> vsB;
  boolean vsC;
  boolean vsD;
  boolean vsE;
  boolean vsF;
  boolean vsG;
  boolean vsH;
  boolean vsI;
  boolean vsJ;
  boolean vsK;
  boolean vsL;
  boolean vsM;
  boolean vsN;
  boolean vsO;
  boolean vsP;
  int vsQ;
  private int vsR;
  boolean vsS;
  Object vsT;
  private ArrayList<com.tencent.mm.pluginsdk.ui.applet.m> vsz;

  static
  {
    AppMethodBeat.i(79907);
    vsy = new c(500);
    vsU = new Class[] { com.tencent.mm.ui.widget.a.class, n.class, ForegroundColorSpan.class };
    AppMethodBeat.o(79907);
  }

  public p(Context paramContext)
  {
    AppMethodBeat.i(79883);
    this.vsz = new ArrayList();
    this.vsA = new ArrayList();
    this.vsB = new ArrayList();
    this.sW = null;
    this.vsC = false;
    this.vsD = true;
    this.vsE = false;
    this.vsF = false;
    this.vsG = true;
    this.vsH = true;
    this.vsI = false;
    this.vsJ = false;
    this.vsK = false;
    this.vsL = false;
    this.vsM = false;
    this.vsN = true;
    this.vsO = false;
    this.vsP = false;
    this.vsQ = 0;
    this.vsR = 0;
    this.mContext = null;
    this.vsS = false;
    this.vsz = new ArrayList();
    this.vsA = new ArrayList();
    this.vsB = new ArrayList();
    this.mContext = paramContext;
    AppMethodBeat.o(79883);
  }

  private String O(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79885);
    paramCharSequence = paramCharSequence + "@" + this.vsR + "@" + this.vsC + "@" + this.vsF + "@" + this.vsG + "@" + this.vsH + "@" + this.vsQ + "@" + this.vsS + "@" + this.vsK + "@" + this.vsL + "@" + this.vsM;
    AppMethodBeat.o(79885);
    return paramCharSequence;
  }

  private SpannableString P(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79888);
    this.vsz = new ArrayList();
    Object localObject;
    if (this.vsR <= 0)
    {
      if (this.sW != null)
        this.vsR = ((int)this.sW.getTextSize());
    }
    else
    {
      if (this.vsz == null)
        this.vsz = new ArrayList();
      if (this.vsA == null)
        this.vsA = new ArrayList();
      this.vsz.clear();
      this.vsA.clear();
      localObject = paramCharSequence;
      if (o.t(paramCharSequence))
      {
        localObject = paramCharSequence;
        if (this.vsN)
        {
          localObject = paramCharSequence;
          if (d.a.vrE != null)
            if (!d.a.vrE.H(paramCharSequence))
            {
              localObject = paramCharSequence;
              if (!d.a.vrE.G(paramCharSequence));
            }
            else
            {
              localObject = paramCharSequence.toString().replace("\n", "                                                                                                                                                                                                                                                                                                                        ");
            }
        }
      }
      paramCharSequence = (CharSequence)localObject;
      if (this.vsC)
      {
        if (!((CharSequence)localObject).toString().contains("data-miniprogram-appid"))
          break label295;
        paramCharSequence = S((CharSequence)localObject);
      }
      label187: localObject = paramCharSequence;
      if (this.vsK)
        localObject = Q(paramCharSequence);
      paramCharSequence = (CharSequence)localObject;
      if (this.vsM)
        paramCharSequence = b((CharSequence)localObject, this.vsP);
      if ((!this.vsN) || (d.a.vrE == null))
        break label321;
      paramCharSequence = d.a.vrE.o(paramCharSequence, this.vsR);
    }
    label295: label321: 
    while (true)
    {
      if (this.vsD)
        T(paramCharSequence);
      if ((paramCharSequence instanceof Spannable))
      {
        paramCharSequence = (SpannableString)paramCharSequence;
        AppMethodBeat.o(79888);
      }
      while (true)
      {
        return paramCharSequence;
        this.vsR = com.tencent.mm.bz.a.al(this.mContext, 2131427813);
        break;
        paramCharSequence = R((CharSequence)localObject);
        break label187;
        paramCharSequence = new SpannableString(paramCharSequence);
        AppMethodBeat.o(79888);
      }
    }
  }

  private CharSequence Q(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79889);
    Object localObject1 = i.a.vrM.matcher(paramCharSequence.toString());
    Object localObject2 = paramCharSequence;
    paramCharSequence = (CharSequence)localObject1;
    if (paramCharSequence.find())
    {
      if (this.vsL)
        paramCharSequence = ((CharSequence)localObject2).toString().replace(paramCharSequence.group(0), "");
      while (true)
      {
        localObject1 = i.a.vrH.matcher(paramCharSequence);
        localObject2 = paramCharSequence;
        paramCharSequence = (CharSequence)localObject1;
        break;
        localObject2 = ((CharSequence)localObject2).toString().replace(paramCharSequence.group(0), "  ");
        localObject1 = paramCharSequence.group(1);
        int i = paramCharSequence.start();
        int j = this.mContext.getResources().getIdentifier(((String)localObject1).toLowerCase(), "drawable", this.mContext.getPackageName());
        if (j != 0)
        {
          paramCharSequence = new r(i, i + 2, j);
          if ((!bo.isNullOrNil((String)localObject1)) && ("original_label".equals(localObject1)))
          {
            paramCharSequence.height = 15;
            paramCharSequence.width = 35;
          }
          this.vsB.add(paramCharSequence);
          paramCharSequence = (CharSequence)localObject2;
        }
        else
        {
          ab.w("MicroMsg.SpanProcessor", "dz[parseImgSpan:error drawable name %s]", new Object[] { localObject1 });
          paramCharSequence = (CharSequence)localObject2;
        }
      }
    }
    AppMethodBeat.o(79889);
    return localObject2;
  }

  private CharSequence R(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79891);
    String str1 = paramCharSequence.toString();
    Matcher localMatcher;
    if (str1.length() < 1500)
      localMatcher = i.a.vrH.matcher(str1);
    while (localMatcher.find())
    {
      String str2 = localMatcher.group(1);
      String str3 = localMatcher.group(2);
      if (str2.length() >= 2)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        if (localMatcher.start(0) > 0)
          localStringBuilder.append(str1.substring(0, localMatcher.start(0)));
        localStringBuilder.append(str3);
        if (localMatcher.end(0) < str1.length())
          localStringBuilder.append(str1.substring(localMatcher.end(0), str1.length()));
        str1 = localStringBuilder.toString();
        int i = localMatcher.start(0);
        int j = str3.length() + i;
        if ((i < 0) || (j > paramCharSequence.length()))
        {
          ab.e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramCharSequence.length()) });
          continue;
          localMatcher = i.a.vrG.matcher(str1);
        }
        else
        {
          an(str2, i, j);
          if (str1.length() < 1500)
            localMatcher = i.a.vrH.matcher(str1);
          else
            localMatcher = i.a.vrG.matcher(str1);
        }
      }
    }
    AppMethodBeat.o(79891);
    return str1;
  }

  private CharSequence S(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79892);
    String str1 = paramCharSequence.toString();
    Object localObject1;
    if (str1.length() < 1500)
      localObject1 = i.a.vrJ.matcher(str1);
    while (((Matcher)localObject1).find())
    {
      String str2 = ((Matcher)localObject1).group(0);
      String str3 = ((Matcher)localObject1).group(1);
      String str4 = ((Matcher)localObject1).group(2);
      Object localObject2 = br.z(str2.replace(str3, " ").replace(str4, " "), "a");
      if (localObject2 == null)
      {
        ab.e("MicroMsg.SpanProcessor", "XmlParser parse return null, so continue");
        continue;
        localObject1 = i.a.vrI.matcher(str1);
      }
      else
      {
        String str5 = (String)((Map)localObject2).get(".a.$data-miniprogram-appid");
        localObject2 = (String)((Map)localObject2).get(".a.$data-miniprogram-path");
        int i;
        label154: int j;
        if (!bo.isNullOrNil(str3))
        {
          i = 1;
          if (bo.isNullOrNil(str5))
            break label279;
          j = 1;
        }
        while (true)
          if ((i != 0) && (j == 0))
          {
            if (str3.length() < 2)
              break;
            str1 = str1.toString().replace(str2, str4);
            j = ((Matcher)localObject1).start(0);
            i = str4.length() + j;
            if ((j < 0) || (i > paramCharSequence.length()))
            {
              ab.e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramCharSequence.length()) });
              break;
              i = 0;
              break label154;
              label279: j = 0;
              continue;
            }
            an(str3, j, i);
          }
        while (true)
          if (str1.length() < 1500)
          {
            localObject1 = i.a.vrJ.matcher(str1);
            break;
            if (j != 0)
            {
              if (this.vsL)
              {
                str1 = str1.toString().replace(str2, str4);
                j = ((Matcher)localObject1).start(0);
                i = str4.length();
                localObject1 = new com.tencent.mm.pluginsdk.ui.applet.m(str3, 45, null);
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject1).start = j;
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject1).end = (i + j);
                this.vsz.add(localObject1);
              }
              else
              {
                str3 = "    ".concat(String.valueOf(str4));
                str1 = str1.toString().replace(str2, str3);
                j = ((Matcher)localObject1).start(0);
                i = str3.length();
                localObject1 = new r(j + 1, j + 3, 2131232001);
                this.vsB.add(localObject1);
                localObject1 = new com.tencent.mm.pluginsdk.ui.applet.m(str5, 45, localObject2);
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject1).start = (j + 4);
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject1).end = (i + j);
                this.vsz.add(localObject1);
              }
            }
            else
            {
              ab.e("MicroMsg.SpanProcessor", "url && appId is null, continue");
              break;
            }
          }
        localObject1 = i.a.vrI.matcher(str1);
      }
    }
    AppMethodBeat.o(79892);
    return str1;
  }

  private void T(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79893);
    if (this.vsG)
      this.vsA.addAll(U(paramCharSequence));
    if (this.vsC)
      this.vsA.addAll(W(paramCharSequence));
    if (this.vsE)
      this.vsA.addAll(X(paramCharSequence));
    if (this.vsJ)
      this.vsA.addAll(ab(paramCharSequence));
    if (this.vsH)
      this.vsA.addAll(Y(paramCharSequence));
    if (this.vsF)
      this.vsA.addAll(Z(paramCharSequence));
    if (this.vsI)
      this.vsA.addAll(aa(paramCharSequence));
    if (this.vsO)
      this.vsA.addAll(V(paramCharSequence));
    AppMethodBeat.o(79893);
  }

  private ArrayList<p.a> U(CharSequence paramCharSequence)
  {
    int i = 2000;
    AppMethodBeat.i(79894);
    ArrayList localArrayList = new ArrayList();
    Object localObject = i.a.vrQ;
    if (paramCharSequence.length() > 2000);
    while (true)
    {
      localObject = ((Pattern)localObject).matcher(paramCharSequence.subSequence(0, i));
      while (((Matcher)localObject).find())
      {
        i = ((Matcher)localObject).start();
        int j = ((Matcher)localObject).end();
        paramCharSequence = new com.tencent.mm.pluginsdk.ui.applet.m(((Matcher)localObject).group(), 24, null);
        paramCharSequence.start = i;
        paramCharSequence.end = j;
        if (!a(this.vsA, new p.a(this, i, j)))
        {
          this.vsz.add(paramCharSequence);
          localArrayList.add(new p.a(this, i, j));
        }
      }
      i = paramCharSequence.length();
    }
    AppMethodBeat.o(79894);
    return localArrayList;
  }

  private ArrayList<p.a> V(CharSequence paramCharSequence)
  {
    int i = 2000;
    AppMethodBeat.i(79895);
    ArrayList localArrayList = new ArrayList();
    Object localObject = i.a.vrR;
    if (paramCharSequence.length() > 2000);
    while (true)
    {
      paramCharSequence = ((Pattern)localObject).matcher(paramCharSequence.subSequence(0, i));
      while (paramCharSequence.find())
      {
        i = paramCharSequence.start();
        int j = paramCharSequence.end();
        localObject = new com.tencent.mm.pluginsdk.ui.applet.m(paramCharSequence.group(), 48, null);
        ((com.tencent.mm.pluginsdk.ui.applet.m)localObject).start = i;
        ((com.tencent.mm.pluginsdk.ui.applet.m)localObject).end = j;
        if (!a(this.vsA, new p.a(this, i, j)))
        {
          this.vsz.add(localObject);
          localArrayList.add(new p.a(this, i, j));
        }
      }
      i = paramCharSequence.length();
    }
    AppMethodBeat.o(79895);
    return localArrayList;
  }

  private ArrayList<p.a> W(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79896);
    ArrayList localArrayList = new ArrayList();
    String str = paramCharSequence.toString();
    if (str.length() > 500)
      paramCharSequence = i.a.vrP.matcher(str.toLowerCase());
    while (paramCharSequence.find())
    {
      int i = paramCharSequence.start();
      int j = paramCharSequence.end();
      if ((!a(this.vsA, new p.a(this, i, j))) && (i >= 0) && (j <= str.length()))
        if (j < str.length())
        {
          int k = str.charAt(j);
          if ((97 <= k) && (k <= 122));
        }
        else
        {
          com.tencent.mm.pluginsdk.ui.applet.m localm = new com.tencent.mm.pluginsdk.ui.applet.m(str.substring(i, j), 1, this.vsT);
          localm.start = i;
          localm.end = j;
          this.vsz.add(localm);
          localArrayList.add(new p.a(this, i, j));
          continue;
          paramCharSequence = i.a.vrO.matcher(str.toLowerCase());
        }
    }
    AppMethodBeat.o(79896);
    return localArrayList;
  }

  private ArrayList<p.a> X(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79897);
    ArrayList localArrayList = new ArrayList();
    String str = paramCharSequence.toString();
    if (str.length() > 200)
      AppMethodBeat.o(79897);
    while (true)
    {
      return localArrayList;
      paramCharSequence = i.a.vrW.matcher(str);
      while (paramCharSequence.find())
      {
        int i = paramCharSequence.start();
        int j = paramCharSequence.end();
        if ((!a(this.vsA, new p.a(this, i, j))) && (i >= 0) && (j <= str.length()))
        {
          com.tencent.mm.pluginsdk.ui.applet.m localm = new com.tencent.mm.pluginsdk.ui.applet.m(str.substring(i, j), 44, this.vsT);
          localm.start = i;
          localm.end = j;
          this.vsz.add(localm);
          localArrayList.add(new p.a(this, i, j));
        }
      }
      AppMethodBeat.o(79897);
    }
  }

  private ArrayList<p.a> Y(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79898);
    ArrayList localArrayList = new ArrayList();
    String str = paramCharSequence.toString();
    Matcher localMatcher = i.a.vrT.matcher(paramCharSequence);
    while (localMatcher.find())
    {
      int i = localMatcher.start();
      int j = localMatcher.end();
      if ((!a(this.vsA, new p.a(this, i, j))) && (i >= 0) && (j <= str.length()))
      {
        paramCharSequence = new com.tencent.mm.pluginsdk.ui.applet.m(str.substring(i, j), 28, null);
        paramCharSequence.start = i;
        paramCharSequence.end = j;
        this.vsz.add(paramCharSequence);
        localArrayList.add(new p.a(this, i, j));
      }
    }
    AppMethodBeat.o(79898);
    return localArrayList;
  }

  private ArrayList<p.a> Z(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79899);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = i.a.vrS.matcher(paramCharSequence);
    while (paramCharSequence.find())
    {
      int i = paramCharSequence.start();
      int j = paramCharSequence.end();
      Object localObject = paramCharSequence.group();
      int k = j - i;
      int m = k;
      if (((String)localObject).startsWith("+"))
        m = k - 1;
      if (((m != 6) && (m != 5)) || (("+12306+12110+12395+12121+12117+12119+95555+95566+95533+95588+95558+95599+95568+95595+95559+95508+95528+95501+95577+95561+10086+10010+10000+17951+17911+17900+118114+116114+950718+95598+12318+12315+12358+12365+12310+12369+12333+12366+95518+95519+95511+95500+95522+95567+95017".contains((CharSequence)localObject)) && (m < 24) && (!a(this.vsA, new p.a(this, i, j)))))
      {
        localObject = new com.tencent.mm.pluginsdk.ui.applet.m((String)localObject, 25, this.vsT);
        ((com.tencent.mm.pluginsdk.ui.applet.m)localObject).start = i;
        ((com.tencent.mm.pluginsdk.ui.applet.m)localObject).end = j;
        this.vsz.add(localObject);
        localArrayList.add(new p.a(this, i, j));
      }
    }
    AppMethodBeat.o(79899);
    return localArrayList;
  }

  private void a(SpannableString paramSpannableString)
  {
    int i = 0;
    AppMethodBeat.i(79905);
    if (this.sW != null)
    {
      paramSpannableString = new m();
      paramSpannableString.hcl = this.hcl;
      this.sW.setOnTouchListener(paramSpannableString);
      AppMethodBeat.o(79905);
    }
    while (true)
    {
      return;
      if (paramSpannableString != null)
      {
        paramSpannableString = (n[])paramSpannableString.getSpans(0, paramSpannableString.length(), n.class);
        if ((paramSpannableString != null) && (paramSpannableString.length > 0) && (this.hcl != null))
        {
          int j = paramSpannableString.length;
          while (i < j)
          {
            paramSpannableString[i].setSessionId(this.hcl);
            i++;
          }
        }
      }
      AppMethodBeat.o(79905);
    }
  }

  private static boolean a(ArrayList<p.a> paramArrayList, p.a parama)
  {
    AppMethodBeat.i(79903);
    paramArrayList = paramArrayList.iterator();
    boolean bool;
    while (paramArrayList.hasNext())
      if (((p.a)paramArrayList.next()).a(parama))
      {
        bool = true;
        AppMethodBeat.o(79903);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79903);
    }
  }

  private ArrayList<p.a> aa(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79900);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.bB(this.mContext, paramCharSequence.toString()).iterator();
    while (localIterator.hasNext())
    {
      paramCharSequence = (com.tencent.mm.pluginsdk.ui.applet.m)localIterator.next();
      p.a locala = new p.a(this, paramCharSequence.start, paramCharSequence.end);
      if (!a(this.vsA, locala))
      {
        this.vsz.add(paramCharSequence);
        localArrayList.add(locala);
      }
    }
    AppMethodBeat.o(79900);
    return localArrayList;
  }

  private ArrayList<p.a> ab(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79901);
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = paramCharSequence.toString();
    Matcher localMatcher = i.a.vrV.matcher(paramCharSequence);
    int i;
    int j;
    p.a locala;
    com.tencent.mm.pluginsdk.ui.applet.m localm;
    while (localMatcher.find())
    {
      i = localMatcher.start();
      j = localMatcher.end();
      locala = new p.a(this, i, j);
      if ((!a(this.vsA, locala)) && (i >= 0) && (j <= paramCharSequence.length()))
      {
        localm = new com.tencent.mm.pluginsdk.ui.applet.m(paramCharSequence.substring(i, j), 30, null);
        localm.start = i;
        localm.end = j;
        this.vsz.add(localm);
        localArrayList.add(locala);
      }
    }
    if (localArrayList.size() <= 0)
    {
      localMatcher = i.a.vrU.matcher(paramCharSequence);
      while (localMatcher.find())
      {
        j = localMatcher.start();
        i = localMatcher.end();
        locala = new p.a(this, j, i);
        if ((!a(this.vsA, locala)) && (j >= 0) && (i <= paramCharSequence.length()))
        {
          localm = new com.tencent.mm.pluginsdk.ui.applet.m(paramCharSequence.substring(j, i), 30, null);
          localm.start = j;
          localm.end = i;
          this.vsz.add(localm);
          localArrayList.add(locala);
        }
      }
    }
    AppMethodBeat.o(79901);
    return localArrayList;
  }

  private boolean an(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79902);
    paramString = a.a(this.mContext, paramString, paramInt1, paramInt2);
    boolean bool;
    if (paramString != null)
    {
      if (this.vsT != null)
        paramString.data = this.vsT;
      this.vsz.add(paramString);
      this.vsA.add(new p.a(this, paramInt1, paramInt2));
      bool = true;
      AppMethodBeat.o(79902);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79902);
    }
  }

  private CharSequence b(CharSequence paramCharSequence, boolean paramBoolean)
  {
    AppMethodBeat.i(79890);
    Object localObject1 = i.a.vrK.matcher(paramCharSequence);
    int i = 0;
    Object localObject3 = paramCharSequence;
    String str2;
    String str3;
    int k;
    Object localObject2;
    while (true)
      if (((Matcher)localObject1).find())
      {
        String str1 = ((Matcher)localObject1).group(0);
        str2 = ((Matcher)localObject1).group(1);
        localObject4 = ((Matcher)localObject1).group(2);
        str3 = ((Matcher)localObject1).group(3);
        localObject3 = ((CharSequence)localObject3).toString().replace(str1, str3);
        int j = ((Matcher)localObject1).start(0);
        k = str3.length() + j;
        if ((j < 0) || (k > paramCharSequence.length()))
        {
          ab.e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramCharSequence.length()) });
          continue;
        }
        try
        {
          i = Color.parseColor(str2);
          if (bo.isNullOrNil((String)localObject4))
          {
            localObject1 = new com.tencent.mm.pluginsdk.ui.applet.m(j, k);
            ((com.tencent.mm.pluginsdk.ui.applet.m)localObject1).linkColor = i;
            this.vsz.add(localObject1);
            this.vsA.add(new p.a(this, j, k));
            localObject1 = i.a.vrK.matcher((CharSequence)localObject3);
            i = 1;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.w("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error at color : %s]", new Object[] { str2 });
            i = 0;
            continue;
            localObject2 = a.a(this.mContext, (String)localObject4, j, k, i, i & 0x99FFFFFF);
            if (localObject2 != null)
            {
              if (this.vsT != null)
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).data = this.vsT;
              this.vsz.add(localObject2);
              this.vsA.add(new p.a(this, j, k));
            }
          }
        }
      }
    Object localObject4 = localObject3;
    if (i == 0)
    {
      localObject2 = i.a.vrL.matcher(paramCharSequence);
      while (true)
      {
        localObject4 = localObject3;
        if (!((Matcher)localObject2).find())
          break;
        str3 = ((Matcher)localObject2).group(0);
        localObject4 = ((Matcher)localObject2).group(1);
        str2 = ((Matcher)localObject2).group(2);
        if (((String)localObject4).length() >= 2)
        {
          localObject3 = ((CharSequence)localObject3).toString().replace(str3, str2);
          k = ((Matcher)localObject2).start(0);
          i = str2.length() + k;
          if ((k < 0) || (i > paramCharSequence.length()))
          {
            ab.e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(paramCharSequence.length()) });
          }
          else
          {
            if ((!an((String)localObject4, k, i)) && (paramBoolean))
            {
              localObject2 = new com.tencent.mm.pluginsdk.ui.applet.m((String)localObject4, 2147483646, null);
              if (this.vsT != null)
                ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).data = this.vsT;
              ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).start = k;
              ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).end = i;
              if (!a(this.vsA, new p.a(this, k, i)))
              {
                this.vsz.add(localObject2);
                this.vsA.add(new p.a(this, k, i));
              }
            }
            localObject2 = i.a.vrK.matcher((CharSequence)localObject3);
          }
        }
      }
    }
    AppMethodBeat.o(79890);
    return localObject4;
  }

  public static void clearCache()
  {
    AppMethodBeat.i(79906);
    vsy.clear();
    AppMethodBeat.o(79906);
  }

  private static void e(Spannable paramSpannable)
  {
    AppMethodBeat.i(79887);
    Object[] arrayOfObject = paramSpannable.getSpans(0, paramSpannable.length(), Object.class);
    int i = arrayOfObject.length;
    int j = 0;
    if (j < i)
    {
      Object localObject = arrayOfObject[j];
      int k = 0;
      label40: if (k < vsU.length)
        if (!vsU[k].isInstance(localObject));
      for (k = 1; ; k = 0)
      {
        if (k == 0)
          paramSpannable.removeSpan(localObject);
        j++;
        break;
        k++;
        break label40;
      }
    }
    AppMethodBeat.o(79887);
  }

  private void f(Spannable paramSpannable)
  {
    AppMethodBeat.i(79904);
    if ((this.sW != null) && (!bo.isNullOrNil(paramSpannable.toString())))
      if (ae.giY)
      {
        this.sW.setText(paramSpannable, TextView.BufferType.SPANNABLE);
        AppMethodBeat.o(79904);
      }
    while (true)
    {
      return;
      this.sW.setText(paramSpannable);
      AppMethodBeat.o(79904);
    }
  }

  public final SpannableString b(CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(79886);
    if (paramCharSequence == null)
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(79886);
    }
    while (true)
    {
      return paramCharSequence;
      this.vsR = paramInt;
      String str = O(paramCharSequence);
      Object localObject1;
      if (paramBoolean)
      {
        localObject1 = (SpannableString)vsy.get(str);
        if (localObject1 != null)
        {
          e((Spannable)localObject1);
          f((Spannable)localObject1);
          a((SpannableString)localObject1);
          AppMethodBeat.o(79886);
          paramCharSequence = (CharSequence)localObject1;
        }
      }
      else
      {
        paramCharSequence = P(paramCharSequence);
        Object localObject2;
        if (this.vsS)
        {
          localObject1 = this.vsz.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.mm.pluginsdk.ui.applet.m)((Iterator)localObject1).next();
            ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).hcl = this.hcl;
            if (bo.isNullOrNil(((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).url))
              paramCharSequence.setSpan(new ForegroundColorSpan(((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).linkColor), ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).start, ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).end, 33);
            else if ((((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).start <= paramCharSequence.length()) && (((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).end <= paramCharSequence.length()))
              paramCharSequence.setSpan(new n(this.vsQ, (com.tencent.mm.pluginsdk.ui.applet.m)localObject2), ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).start, ((com.tencent.mm.pluginsdk.ui.applet.m)localObject2).end, 33);
          }
        }
        localObject1 = this.vsB.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (r)((Iterator)localObject1).next();
          if ((((r)localObject2).start <= paramCharSequence.length()) && (((r)localObject2).end <= paramCharSequence.length()))
          {
            Object localObject3 = this.mContext.getResources().getDrawable(((r)localObject2).id);
            if ((((r)localObject2).width > 0) && (((r)localObject2).height > 0))
            {
              ((Drawable)localObject3).setBounds(0, 0, com.tencent.mm.bz.a.fromDPToPix(this.mContext, ((r)localObject2).width), com.tencent.mm.bz.a.fromDPToPix(this.mContext, ((r)localObject2).height));
              localObject3 = new com.tencent.mm.ui.widget.a((Drawable)localObject3);
              ((com.tencent.mm.ui.widget.a)localObject3).zLT = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 2);
              paramCharSequence.setSpan(localObject3, ((r)localObject2).start, ((r)localObject2).start + 1, 18);
            }
            else
            {
              if (this.sW == null);
              for (paramInt = (int)(this.vsR * 1.3F); ; paramInt = (int)(this.sW.getTextSize() * 1.3F))
              {
                ((Drawable)localObject3).setBounds(0, 0, paramInt, paramInt);
                break;
              }
            }
          }
        }
        f(paramCharSequence);
        a(paramCharSequence);
        if (paramBoolean)
          vsy.k(str, new SpannableString(paramCharSequence));
        AppMethodBeat.o(79886);
      }
    }
  }

  public final p m(TextView paramTextView)
  {
    AppMethodBeat.i(79884);
    this.sW = paramTextView;
    if (paramTextView != null)
      this.mContext = this.sW.getContext();
    AppMethodBeat.o(79884);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.p
 * JD-Core Version:    0.6.2
 */