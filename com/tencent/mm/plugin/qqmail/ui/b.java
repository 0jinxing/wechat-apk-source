package com.tencent.mm.plugin.qqmail.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.ah;
import com.tencent.mm.plugin.qqmail.b.ai;
import com.tencent.mm.plugin.qqmail.b.u;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.plugin.qqmail.b.v.c;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements f
{
  int mode;
  private TextView pwq;
  private ImageView pwr;
  ComposeUI pxP;
  ViewGroup pxQ;
  Map<String, ai> pxR;
  Map<String, u> pxS;
  Map<String, String> pxT;
  Map<String, String> pxU;
  b.b pxV;
  private View.OnClickListener pxW;

  private b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(68295);
    this.pxR = new HashMap();
    this.pxS = new HashMap();
    this.pxT = new LinkedHashMap();
    this.pxU = new LinkedHashMap();
    this.pxV = null;
    this.pxW = null;
    this.mode = 5;
    this.pxP = paramComposeUI;
    this.pxQ = paramViewGroup;
    this.pxW = null;
    this.pwq = paramTextView;
    this.pwr = paramImageView;
    cdd();
    com.tencent.mm.kernel.g.RO().eJo.a(484, this);
    AppMethodBeat.o(68295);
  }

  public b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup, byte paramByte)
  {
    this(paramComposeUI, paramTextView, paramImageView, paramViewGroup);
  }

  private void a(final ai paramai)
  {
    AppMethodBeat.i(68299);
    LinearLayout localLinearLayout = (LinearLayout)((ViewGroup)View.inflate(this.pxP, 2130970425, null)).findViewById(2131826696);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(2131826697);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(2131826698);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(2131826699);
    ProgressBar localProgressBar = (ProgressBar)localLinearLayout.findViewById(2131826700);
    TextView localTextView3 = (TextView)localLinearLayout.findViewById(2131826701);
    ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(2131826702);
    ImageView localImageView3 = (ImageView)localLinearLayout.findViewById(2131826703);
    ((ViewGroup)localLinearLayout.getParent()).removeView(localLinearLayout);
    localImageView1.setImageResource(FileExplorerUI.ajW(paramai.name));
    localTextView1.setText(paramai.name);
    localTextView2.setText(bo.ga(paramai.size));
    b.a locala = new b.a(this, (byte)0);
    locala.iqT = localImageView1;
    locala.gxi = localTextView1;
    locala.pxy = localTextView2;
    locala.pyf = localProgressBar;
    locala.pyg = localTextView3;
    locala.pyh = localImageView2;
    locala.pyi = localImageView3;
    localLinearLayout.setTag(locala);
    localLinearLayout.setId(Math.abs(paramai.path.hashCode() / 2));
    if (this.pxW != null)
      localLinearLayout.setOnClickListener(this.pxW);
    this.pxQ.addView(localLinearLayout);
    cdd();
    localLinearLayout.setOnClickListener(new b.1(this, localImageView2));
    localImageView2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(68283);
        long l;
        if (b.this.mode == 5)
        {
          l = b.this.Vr(paramai.path);
          paramai.pvG = l;
          AppMethodBeat.o(68283);
        }
        while (true)
        {
          return;
          if (b.this.mode == 6)
          {
            l = b.this.fH(paramai.path, paramai.name);
            paramai.pvG = l;
          }
          AppMethodBeat.o(68283);
        }
      }
    });
    localImageView3.setOnClickListener(new b.3(this, paramai, localLinearLayout));
    this.pxQ.post(new b.4(this, paramai));
    if (paramai.state == 0)
      if (this.mode == 5)
      {
        paramai.pvG = Vr(paramai.path);
        AppMethodBeat.o(68299);
      }
    while (true)
    {
      return;
      if (this.mode == 6)
        paramai.pvG = fH(paramai.path, paramai.name);
      AppMethodBeat.o(68299);
    }
  }

  final long Vr(final String paramString)
  {
    AppMethodBeat.i(68303);
    v.c localc = new v.c();
    localc.puP = false;
    localc.puO = true;
    long l = ac.ccC().a("/cgi-bin/uploaddata", "UploadFile", paramString, localc, new v.a()
    {
      public final void onComplete()
      {
        AppMethodBeat.i(68290);
        b.a(b.this);
        AppMethodBeat.o(68290);
      }

      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        AppMethodBeat.i(68289);
        ab.e("MicroMsg.FileUploadHelper", "errCode:%d, desc:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        paramAnonymousString = (ai)b.this.pxR.get(paramString);
        if (paramAnonymousString != null)
        {
          paramAnonymousString.state = 3;
          b.this.b(paramAnonymousString);
        }
        if (paramAnonymousInt == -5)
        {
          b.this.pxP.pwy.a(new b.5.1(this));
          AppMethodBeat.o(68289);
        }
        while (true)
        {
          return;
          AppMethodBeat.o(68289);
        }
      }

      public final boolean onReady()
      {
        AppMethodBeat.i(68287);
        ai localai = (ai)b.this.pxR.get(paramString);
        if (localai != null)
        {
          localai.state = 1;
          b.this.b(localai);
        }
        AppMethodBeat.o(68287);
        return true;
      }

      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        AppMethodBeat.i(68288);
        paramAnonymousMap = (String)paramAnonymousMap.get(".Response.result.DataID");
        paramAnonymousString = (ai)b.this.pxR.get(paramString);
        if (paramAnonymousString != null)
        {
          paramAnonymousString.state = 2;
          paramAnonymousString.pvH = paramAnonymousMap;
          b.this.b(paramAnonymousString);
        }
        AppMethodBeat.o(68288);
      }
    });
    AppMethodBeat.o(68303);
    return l;
  }

  final void b(ai paramai)
  {
    AppMethodBeat.i(68308);
    int i = Math.abs(paramai.path.hashCode() / 2);
    Object localObject = (LinearLayout)this.pxQ.findViewById(i);
    if (localObject == null)
    {
      AppMethodBeat.o(68308);
      return;
    }
    localObject = (b.a)((LinearLayout)localObject).getTag();
    switch (paramai.state)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(68308);
      break;
      ((b.a)localObject).gxi.setTextColor(-16777216);
      ((b.a)localObject).pyf.setVisibility(0);
      ((b.a)localObject).pyg.setVisibility(8);
      ((b.a)localObject).pyh.setVisibility(8);
      ((b.a)localObject).pyi.setVisibility(0);
      AppMethodBeat.o(68308);
      break;
      ((b.a)localObject).gxi.setTextColor(-16777216);
      ((b.a)localObject).pyf.setVisibility(8);
      ((b.a)localObject).pyg.setVisibility(8);
      ((b.a)localObject).pyh.setVisibility(8);
      ((b.a)localObject).pyi.setVisibility(0);
      AppMethodBeat.o(68308);
      break;
      ((b.a)localObject).gxi.setTextColor(a.i(this.pxP, 2131690205));
      ((b.a)localObject).pyf.setVisibility(8);
      ((b.a)localObject).pyg.setVisibility(0);
      ((b.a)localObject).pyh.setVisibility(0);
      ((b.a)localObject).pyi.setVisibility(0);
    }
  }

  public final void cI(List<ai> paramList)
  {
    AppMethodBeat.i(68296);
    if (paramList == null)
      AppMethodBeat.o(68296);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ai localai = (ai)localIterator.next();
        a(localai);
        this.pxR.put(localai.path, localai);
      }
      if (this.mode == 6)
      {
        localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = (ai)localIterator.next();
          this.pxT.put(paramList.path, paramList.pvH);
          this.pxU.put(paramList.path, paramList.name);
        }
      }
      AppMethodBeat.o(68296);
    }
  }

  public final String ccZ()
  {
    AppMethodBeat.i(68300);
    String str1 = "";
    Iterator localIterator = this.pxR.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      String str3 = str1;
      if (str1.length() > 0)
        str3 = str1 + "|";
      str1 = str3 + ((ai)this.pxR.get(str2)).pvH;
    }
    AppMethodBeat.o(68300);
    return str1;
  }

  public final LinkedList<ai> cda()
  {
    AppMethodBeat.i(68301);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.pxR.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(this.pxR.get(str));
    }
    AppMethodBeat.o(68301);
    return localLinkedList;
  }

  public final void cdb()
  {
    AppMethodBeat.i(68302);
    Iterator localIterator;
    Object localObject;
    if (this.mode == 5)
    {
      localIterator = this.pxR.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (ai)this.pxR.get(localObject);
        if (((ai)localObject).state != 2)
        {
          ac.ccC().cancel(((ai)localObject).pvG);
          ((ai)localObject).state = 3;
          b((ai)localObject);
        }
      }
      AppMethodBeat.o(68302);
    }
    while (true)
    {
      return;
      if (this.mode == 6)
      {
        localIterator = this.pxR.keySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          localObject = (ai)this.pxR.get(localObject);
          if (((ai)localObject).state != 2)
          {
            u localu = (u)this.pxS.get(((ai)localObject).path);
            if (localu != null)
            {
              com.tencent.mm.kernel.g.RO().eJo.c(localu);
              ((ai)localObject).state = 3;
              b((ai)localObject);
            }
            this.pxT.remove(((ai)localObject).path);
            this.pxU.remove(((ai)localObject).path);
            this.pxS.remove(((ai)localObject).path);
          }
        }
      }
      AppMethodBeat.o(68302);
    }
  }

  public final boolean cdc()
  {
    AppMethodBeat.i(68305);
    Iterator localIterator = this.pxR.keySet().iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (ai)this.pxR.get(localObject);
      if ((((ai)localObject).state != 2) && (((ai)localObject).state != 3))
      {
        bool = false;
        AppMethodBeat.o(68305);
      }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(68305);
    }
  }

  public final void cdd()
  {
    AppMethodBeat.i(68306);
    int i;
    int j;
    if (this.pxR.size() == 0)
    {
      this.pwq.setText(this.pxP.getString(2131301972) + " " + this.pxP.getString(2131301975));
      this.pwr.setImageResource(2131231836);
      ((View)this.pxQ.getParent()).setVisibility(8);
      i = this.pxQ.getChildCount();
      j = 0;
      label102: if (j >= i)
        break label310;
      if (i != 1)
        break label244;
      this.pxQ.getChildAt(j).setBackgroundResource(2130839452);
    }
    while (true)
    {
      j++;
      break label102;
      this.pwq.setText(this.pxP.getString(2131301972) + this.pxP.getResources().getQuantityString(2131361816, this.pxR.size(), new Object[] { Integer.valueOf(this.pxR.size()), bo.ga(cde()) }));
      this.pwr.setImageResource(2131231837);
      ((View)this.pxQ.getParent()).setVisibility(0);
      break;
      label244: if (j == 0)
        this.pxQ.getChildAt(j).setBackgroundResource(2130839453);
      else if ((j > 0) && (j < i - 1))
        this.pxQ.getChildAt(j).setBackgroundResource(2130839454);
      else
        this.pxQ.getChildAt(j).setBackgroundResource(2130839455);
    }
    label310: AppMethodBeat.o(68306);
  }

  public final int cde()
  {
    AppMethodBeat.i(68307);
    Iterator localIterator = this.pxR.keySet().iterator();
    String str;
    long l;
    for (int i = 0; localIterator.hasNext(); i = (int)(((ai)this.pxR.get(str)).size + l))
    {
      str = (String)localIterator.next();
      l = i;
    }
    AppMethodBeat.o(68307);
    return i;
  }

  public final void fG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(68297);
    if ((paramString1 == null) || (paramString1.length() == 0) || (this.pxR.containsKey(paramString1)))
      AppMethodBeat.o(68297);
    File localFile;
    while (true)
    {
      return;
      localFile = new File(paramString1);
      if ((localFile.exists()) && (localFile.isFile()))
        break;
      AppMethodBeat.o(68297);
    }
    ai localai = new ai();
    localai.path = paramString1;
    if (paramString2 == null);
    for (localai.name = localFile.getName(); ; localai.name = paramString2)
    {
      localai.size = localFile.length();
      localai.state = 0;
      this.pxR.put(paramString1, localai);
      a(localai);
      AppMethodBeat.o(68297);
      break;
    }
  }

  final long fH(final String paramString1, final String paramString2)
  {
    AppMethodBeat.i(68304);
    long l;
    if (this.pxS.containsKey(paramString1))
    {
      l = ((u)this.pxS.get(paramString1)).hashCode();
      AppMethodBeat.o(68304);
    }
    while (true)
    {
      return l;
      u localu = new u(paramString1, paramString1, new com.tencent.mm.ai.g()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final m paramAnonymousm)
        {
          AppMethodBeat.i(68293);
          ab.i("MicroMsg.FileUploadHelper", "offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            ab.i("MicroMsg.FileUploadHelper", "uploading file: %s, offset: %d, totalLen: %d", new Object[] { paramString1, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            paramAnonymousm = (ai)b.this.pxR.get(paramString1);
            if (paramAnonymousm != null)
            {
              paramAnonymousm.state = 1;
              al.d(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(68291);
                  b.this.b(paramAnonymousm);
                  AppMethodBeat.o(68291);
                }
              });
            }
            AppMethodBeat.o(68293);
          }
          while (true)
          {
            return;
            if (paramAnonymousInt1 >= paramAnonymousInt2)
            {
              ai localai = (ai)b.this.pxR.get(paramString1);
              paramAnonymousm = ((u)paramAnonymousm).ccv().ptE;
              b.this.pxT.put(paramString1, paramAnonymousm);
              b.this.pxU.put(paramString1, paramString2);
              b.this.pxS.remove(paramString1);
              ab.i("MicroMsg.FileUploadHelper", "finish uploaded file: %s, attachId: %s", new Object[] { paramString1, paramAnonymousm });
              if (localai != null)
              {
                localai.state = 2;
                localai.pvH = paramAnonymousm;
                al.d(new b.6.2(this, localai));
              }
              b.a(b.this);
            }
            AppMethodBeat.o(68293);
          }
        }
      });
      paramString2 = (ai)this.pxR.get(paramString1);
      if (paramString2 != null)
        paramString2.state = 1;
      b(paramString2);
      com.tencent.mm.kernel.g.RO().eJo.a(localu, 0);
      this.pxS.put(paramString1, localu);
      l = localu.hashCode();
      AppMethodBeat.o(68304);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(68309);
    if (paramm.getType() == 484)
    {
      paramm = (u)paramm;
      String str = paramm.filePath;
      paramString = (ai)this.pxR.get(str);
      if ((paramString != null) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        ab.e("MicroMsg.FileUploadHelper", "upload error, errType: %d, errCode: %d, file: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
        paramString.state = 3;
        this.pxS.remove(str);
        com.tencent.mm.kernel.g.RO().eJo.c(paramm);
        al.d(new b.7(this, paramString));
      }
    }
    AppMethodBeat.o(68309);
  }

  public final boolean wi(String paramString)
  {
    AppMethodBeat.i(68298);
    boolean bool = this.pxR.containsKey(paramString);
    AppMethodBeat.o(68298);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.b
 * JD-Core Version:    0.6.2
 */