package com.tencent.mm.ui.conversation;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.NoMeasuredTextView.c;
import com.tencent.mm.ui.f;
import com.tencent.mm.ui.f.a;
import com.tencent.mm.ui.f.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class h extends f<String, ak>
  implements n.b
{
  protected List<String> elZ;
  private boolean gxV;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  private ListView mListView;
  boolean nNp;
  boolean riR;
  private float yDU;
  private float yDV;
  private float yDW;
  private ColorStateList[] yDX;
  HashMap<String, d> yDY;
  public boolean yOf;
  k.a yql;
  private boolean zrm;
  com.tencent.mm.pluginsdk.ui.d zro;
  private boolean zrq;
  com.tencent.mm.sdk.b.c zrt;
  public String zrv;
  private final int zrx;
  private final int zry;
  private HashSet<String> ztA;
  private boolean ztB;
  HashMap<String, Integer> ztC;
  private HashMap<String, Integer> ztD;
  boolean ztE;
  HashSet<String> ztF;
  boolean ztG;
  private boolean ztH;
  private NoMeasuredTextView.c ztI;
  public String ztJ;
  private String ztK;
  private Drawable ztL;
  ValueAnimator ztM;
  final e ztN;
  private float ztO;
  private a ztP;
  private long ztQ;
  boolean ztR;
  private boolean ztx;
  private sz zty;
  h.b ztz;

  public h(Context paramContext, ListView paramListView, f.a parama)
  {
    super(paramContext, (short)0);
    AppMethodBeat.i(34365);
    this.elZ = null;
    this.yDX = new ColorStateList[5];
    this.zrm = true;
    this.ztx = false;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.zty = null;
    this.gxV = false;
    this.yDU = -1.0F;
    this.yDV = -1.0F;
    this.yDW = -1.0F;
    this.zrq = false;
    this.zrt = null;
    this.ztz = null;
    this.yOf = false;
    this.ztB = false;
    this.ztC = new HashMap();
    this.ztD = new HashMap();
    this.ztE = false;
    this.ztG = false;
    this.ztH = false;
    this.ztI = new h.1(this);
    this.zrv = "";
    this.ztJ = "";
    this.yql = new k.a()
    {
      public final void a(String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(34359);
        h.this.notifyDataSetChanged();
        AppMethodBeat.o(34359);
      }
    };
    this.ztN = new e();
    this.riR = false;
    this.ztO = -1.0F;
    this.ztQ = 0L;
    this.nNp = false;
    this.ztR = false;
    this.mListView = paramListView;
    this.TAG = "MicroMsg.ConversationWithCacheAdapter";
    super.a(parama);
    this.yDX[0] = com.tencent.mm.bz.a.h(paramContext, 2131690164);
    this.yDX[1] = com.tencent.mm.bz.a.h(paramContext, 2131690755);
    this.yDX[3] = com.tencent.mm.bz.a.h(paramContext, 2131690316);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[4] = com.tencent.mm.bz.a.h(paramContext, 2131690204);
    if (com.tencent.mm.bz.a.gb(paramContext))
    {
      this.zry = paramContext.getResources().getDimensionPixelSize(2131427557);
      this.zrx = paramContext.getResources().getDimensionPixelSize(2131427558);
    }
    while (true)
    {
      this.yDY = new HashMap();
      this.ztA = new HashSet();
      this.ztF = new HashSet();
      this.yDU = paramContext.getResources().getDimension(2131427813);
      this.yDV = paramContext.getResources().getDimension(2131427762);
      this.yDW = paramContext.getResources().getDimension(2131427866);
      this.elZ = new ArrayList();
      this.elZ.add("qmessage");
      AppMethodBeat.o(34365);
      return;
      if (com.tencent.mm.bz.a.ga(paramContext))
      {
        this.zry = paramContext.getResources().getDimensionPixelSize(2131427556);
        this.zrx = paramContext.getResources().getDimensionPixelSize(2131427558);
      }
      else
      {
        this.zry = paramContext.getResources().getDimensionPixelSize(2131427555);
        this.zrx = paramContext.getResources().getDimensionPixelSize(2131427559);
      }
    }
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(34378);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(34378);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  private static int Pu(int paramInt)
  {
    int i = -1;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 0:
    case 2:
    case 3:
    case 4:
    case 6:
    case 7:
    case 1:
    case 8:
    case 5:
    }
    while (true)
    {
      return j;
      j = 2131231663;
      continue;
      j = 2131231662;
    }
  }

  static int a(ak paramak, d paramd)
  {
    int i = 0;
    AppMethodBeat.i(34377);
    if ((paramak == null) || (paramak.field_unReadCount <= 0))
      if ((paramak != null) && ((paramak.jl(8388608)) || (paramak.jl(2097152))) && (paramak != null) && (paramak.field_unReadMuteCount > 0))
      {
        AppMethodBeat.o(34377);
        i = 1;
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(34377);
      continue;
      if (t.ny(paramak.field_username))
      {
        if ((com.tencent.mm.storage.s.aVO()) && (!paramak.jl(16)) && (!paramak.jl(64)))
        {
          AppMethodBeat.o(34377);
        }
        else
        {
          AppMethodBeat.o(34377);
          i = 1;
        }
      }
      else if (t.nD(paramak.field_username))
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.Ry().getBoolean(ac.a.xON, true))
        {
          AppMethodBeat.o(34377);
          i = 1;
        }
      }
      else if (t.nH(paramak.field_username))
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.Ry().getBoolean(ac.a.xOO, true))
        {
          AppMethodBeat.o(34377);
          i = 1;
        }
      }
      else if ((paramd.zrN) && (paramd.zrS))
      {
        AppMethodBeat.o(34377);
        i = 1;
      }
      else if ((paramd.mgQ) && (paramd.zrR))
      {
        AppMethodBeat.o(34377);
        i = 1;
      }
      else
      {
        i = 2;
        AppMethodBeat.o(34377);
      }
    }
  }

  private SparseArray<String> a(f.b<String, ak> paramb, SparseArray<String> paramSparseArray, HashMap<String, ak> paramHashMap)
  {
    AppMethodBeat.i(34387);
    String str = (String)paramb.object;
    int i = paramSparseArray.size();
    ak localak = (ak)paramb.ygF;
    int j = paramSparseArray.size();
    int k = 0;
    if (k < j)
      if (((String)paramSparseArray.get(k)).equals(str))
      {
        label63: ab.d("MicroMsg.ConversationWithCacheAdapter", "resortPosition username %s,  size %d, position %d", new Object[] { str, Integer.valueOf(i), Integer.valueOf(k) });
        switch (paramb.ygE)
        {
        case 3:
        case 4:
        default:
          if (k < 0)
          {
            ab.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_UPDATE  position < 0");
            AppMethodBeat.o(34387);
          }
          break;
        case 5:
        case 2:
        }
      }
    label151: label220: long l1;
    long l2;
    while (true)
    {
      return paramSparseArray;
      k++;
      break;
      k = -1;
      break label63;
      j = k;
      if (k < 0)
      {
        AppMethodBeat.o(34387);
      }
      else
      {
        while (j < i - 1)
        {
          paramSparseArray.put(j, paramSparseArray.get(j + 1));
          j++;
        }
        paramSparseArray.remove(i - 1);
        while (true)
        {
          AppMethodBeat.o(34387);
          break label151;
          if (localak == null)
          {
            ab.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null");
            if (k >= 0)
            {
              ab.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null delete it username %s", new Object[] { str });
              while (k < i - 1)
              {
                paramSparseArray.put(k, paramSparseArray.get(k + 1));
                k++;
              }
              paramSparseArray.remove(i - 1);
            }
            AppMethodBeat.o(34387);
            break label151;
          }
          if (k >= 0)
            break;
          for (k = 0; (k < i) && (d((String)paramSparseArray.get(k), paramHashMap).field_flag > localak.field_flag); k++);
          for (j = i; j > k; j--)
            paramSparseArray.put(j, paramSparseArray.get(j - 1));
          paramSparseArray.put(k, str);
        }
        paramb = d(str, paramHashMap);
        if (localak == null)
        {
          ab.e("MicroMsg.ConversationWithCacheAdapter", "CursorDataAdapter.CHANGE_TYPE_UPDATE  cov == null delete it username %s", new Object[] { str });
          while (k < i - 1)
          {
            paramSparseArray.put(k, paramSparseArray.get(k + 1));
            k++;
          }
          paramSparseArray.remove(i - 1);
          AppMethodBeat.o(34387);
        }
        else
        {
          l1 = paramb.field_flag;
          l2 = localak.field_flag;
          if (l1 != l2)
            break label505;
          AppMethodBeat.o(34387);
        }
      }
    }
    label505: int m;
    int n;
    if (l1 < l2)
    {
      j = 0;
      m = k - 1;
      n = 1;
      label525: i = j;
      label529: if (i > m)
        break label745;
      if (d((String)paramSparseArray.get(i), paramHashMap).field_flag > localak.field_flag)
        break label654;
    }
    label654: label745: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.ConversationWithCacheAdapter", "resortPosition: begin-%d end-%d tempUpdate-%d found-%b position-%d username-%s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(-1), Boolean.valueOf(bool), Integer.valueOf(k), str });
      if (!bool)
      {
        AppMethodBeat.o(34387);
        break;
        j = k + 1;
        m = i - 1;
        n = 0;
        break label525;
        i++;
        break label529;
      }
      if (n != 0)
        while (k > i)
        {
          paramSparseArray.put(k, paramSparseArray.get(k - 1));
          k--;
        }
      i--;
      for (j = k; ; j++)
      {
        k = i;
        if (j >= i)
          break;
        paramSparseArray.put(j, paramSparseArray.get(j + 1));
      }
      k = i;
      paramSparseArray.put(k, str);
      break label220;
    }
  }

  private void a(d paramd, ad paramad)
  {
    AppMethodBeat.i(34376);
    if ((paramd.mgQ) && (paramd.eoz == null))
    {
      paramd.nickName = this.context.getString(2131298223);
      AppMethodBeat.o(34376);
    }
    while (true)
    {
      return;
      if (ad.aox(paramad.field_username))
      {
        paramd.nickName = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).e(com.tencent.mm.sdk.platformtools.ah.getContext(), paramd.eoz, com.tencent.mm.bz.a.al(this.context, 2131427813));
        AppMethodBeat.o(34376);
      }
      else
      {
        paramd.nickName = j.b(this.context, paramd.eoz, com.tencent.mm.bz.a.al(this.context, 2131427813));
        AppMethodBeat.o(34376);
      }
    }
  }

  private static String aqV(String paramString)
  {
    AppMethodBeat.i(34382);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(34382);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(34382);
    }
  }

  private CharSequence b(ak paramak, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(34380);
    Object localObject1;
    if ((!com.tencent.mm.platformtools.ah.isNullOrNil(paramak.field_editingMsg)) && ((paramak.field_atCount <= 0) || ((paramak.field_unReadCount <= 0) && (paramak.field_unReadMuteCount <= 0))))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(2131301279));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(j.b(this.context, paramak.field_editingMsg, paramInt));
      AppMethodBeat.o(34380);
      paramak = (ak)localObject1;
    }
    Object localObject2;
    Object localObject3;
    label748: String str;
    while (true)
    {
      return paramak;
      if (FB(paramak.field_msgType) == 10000)
      {
        boolean bool1 = t.ny(paramak.field_username);
        boolean bool2 = bool1;
        if (!bool1)
          bool2 = paramak.jl(2097152);
        bool1 = bool2;
        if (!bool2)
          bool1 = paramak.jl(8388608);
        bool2 = bool1;
        if (!bool1)
          bool2 = paramak.jl(16777216);
        bool1 = bool2;
        if (!bool2)
          bool1 = t.nH(paramak.field_username);
        if (!bool1)
        {
          paramak = new SpannableString(j.f(this.context, paramak.field_content, paramInt));
          AppMethodBeat.o(34380);
        }
      }
      else if (FB(paramak.field_msgType) == 49)
      {
        localObject1 = com.tencent.mm.model.s.mJ(paramak.field_digestUser);
        localObject2 = j.b.me(paramak.field_content);
        if ((localObject2 != null) && (((j.b)localObject2).type == 40))
        {
          if (com.tencent.mm.af.n.mj(paramak.field_content).fju == 19)
          {
            if (com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject1));
            for (localObject1 = this.context.getString(2131297030); ; localObject1 = (String)localObject1 + ": " + this.context.getString(2131297030))
            {
              paramak.jh((String)localObject1);
              paramak = j.b(this.context, (CharSequence)localObject1, paramInt);
              AppMethodBeat.o(34380);
              break;
            }
          }
        }
        else
        {
          if ((localObject2 != null) && (((j.b)localObject2).type == 5))
          {
            localObject1 = null;
            try
            {
              paramak = String.format(paramak.field_digest, new Object[] { j(paramak) });
              localObject3 = new StringBuilder();
              localObject1 = paramak;
              if (com.tencent.mm.platformtools.ah.isNullOrNil(paramak))
                localObject1 = this.context.getString(2131297071);
              paramak = (String)localObject1 + " " + ((j.b)localObject2).title;
              paramak = new SpannableString(j.f(this.context, paramak, paramInt));
              AppMethodBeat.o(34380);
            }
            catch (Exception paramak)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.ConversationWithCacheAdapter", paramak, "", new Object[0]);
                paramak = (ak)localObject1;
              }
            }
          }
          if ((localObject2 != null) && (((j.b)localObject2).type == 19))
          {
            if (com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject1));
            for (localObject1 = this.context.getString(2131297030); ; localObject1 = (String)localObject1 + ": " + this.context.getString(2131297030))
            {
              paramak.jh((String)localObject1);
              paramak = j.b(this.context, (CharSequence)localObject1, paramInt);
              AppMethodBeat.o(34380);
              break;
            }
          }
        }
      }
      else
      {
        localObject1 = paramak.field_digest;
        label1162: if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
        {
          paramak = new SpannableString(j.e(this.context, (CharSequence)localObject1, paramInt));
          AppMethodBeat.o(34380);
        }
        else
        {
          localObject1 = paramak.field_username;
          int i;
          if (((String)localObject1).equals("qqmail"))
          {
            aw.ZK();
            if (com.tencent.mm.platformtools.ah.h((Integer)com.tencent.mm.model.c.Ry().get(17, null)) == 1);
            for (i = 1; ; i = 0)
            {
              if (i != 0)
                break label748;
              paramak = this.context.getString(2131303207);
              AppMethodBeat.o(34380);
              break;
            }
          }
          if (((String)localObject1).equals("tmessage"))
          {
            aw.ZK();
            localObject1 = com.tencent.mm.model.c.XU().RA("@t.qq.com");
            if ((localObject1 != null) && (((bq)localObject1).isEnable()));
            for (i = 1; ; i = 0)
            {
              if (i != 0)
                break label823;
              paramak = this.context.getString(2131303207);
              AppMethodBeat.o(34380);
              break;
            }
          }
          label823: if ((paramak.field_msgType != null) && (paramak.field_msgType.equals("64")))
          {
            paramak = paramak.field_content;
            AppMethodBeat.o(34380);
          }
          else if ((paramak.field_msgType != null) && ((paramak.field_msgType.equals("47")) || (paramak.field_msgType.equals("1048625"))))
          {
            localObject1 = aqV(paramak.field_digest);
            localObject2 = "";
            if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject1))
            {
              paramak = "[" + (String)localObject1 + "]";
              AppMethodBeat.o(34380);
            }
            else
            {
              localObject1 = localObject2;
              if (paramak.field_digest != null)
              {
                localObject1 = localObject2;
                if (paramak.field_digest.contains(":"))
                {
                  localObject2 = paramak.field_digest.substring(0, paramak.field_digest.indexOf(":"));
                  localObject3 = aqV(paramak.field_digest.substring(paramak.field_digest.indexOf(":") + 1).replace(" ", ""));
                  localObject1 = localObject2;
                  if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject3))
                  {
                    localObject1 = "[" + (String)localObject3 + "]";
                    if (com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject2))
                    {
                      paramak = j.b(this.context, (CharSequence)localObject2, paramInt);
                      AppMethodBeat.o(34380);
                      continue;
                    }
                    paramak = new SpannableStringBuilder();
                    paramak.append(j.b(this.context, (CharSequence)localObject2, paramInt));
                    paramak.append(": ");
                    paramak.append((CharSequence)localObject1);
                    AppMethodBeat.o(34380);
                  }
                }
              }
              else
              {
                localObject2 = this.context.getString(2131296895);
                if (com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject1))
                {
                  localObject1 = localObject2;
                  paramak.jh((String)localObject1);
                }
              }
            }
          }
          else
          {
            if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramak.field_digest))
              if (com.tencent.mm.platformtools.ah.isNullOrNil(paramak.field_digestUser));
            for (localObject1 = j(paramak); ; str = com.tencent.mm.booter.notification.a.h.a(paramak.field_isSend, paramak.field_username, paramak.field_content, FB(paramak.field_msgType), this.context))
              try
              {
                for (localObject1 = String.format(paramak.field_digest, new Object[] { localObject1 }); ; localObject1 = paramak.field_digest)
                {
                  localObject1 = ((String)localObject1).replace('\n', ' ');
                  if ((!paramak.jl(33554432)) || ((paramak.field_unReadCount <= 0) && (paramak.field_unReadMuteCount <= 0)))
                    break label1389;
                  paramak = new SpannableStringBuilder(this.context.getString(2131303967));
                  paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
                  paramak.append(" ").append(j.b(this.context, (CharSequence)localObject1, paramInt));
                  AppMethodBeat.o(34380);
                  break;
                  localObject1 = (String)localObject1 + ": " + (String)localObject2;
                  break label1162;
                }
              }
              catch (Exception localException)
              {
              }
            label1389: if (paramak.field_UnReadInvite > 0)
            {
              if (paramak.field_UnReadInvite < 4096);
              for (paramak = this.context.getString(2131301276, new Object[] { Integer.valueOf(paramak.field_UnReadInvite) }); ; paramak = this.context.getString(2131301274))
              {
                paramak = new SpannableStringBuilder(paramak);
                paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
                paramak.append(" ").append(j.b(this.context, str, paramInt));
                AppMethodBeat.o(34380);
                break;
              }
            }
            if ((paramak.field_atCount > 0) && ((paramak.field_unReadCount > 0) || (paramak.field_unReadMuteCount > 0)))
            {
              localObject2 = this.context;
              if (paramak.field_atCount < 4096);
              for (i = 2131301275; ; i = 2131301277)
              {
                paramak = new SpannableStringBuilder(((Context)localObject2).getString(i));
                paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
                paramak.append(" ").append(j.b(this.context, str, paramInt));
                AppMethodBeat.o(34380);
                break;
              }
            }
            if ((!paramak.jl(16777216)) || ((paramak.field_unReadCount <= 0) && (paramak.field_unReadMuteCount <= 0)))
              break;
            paramak = this.context.getString(2131296343);
            str = str.replace(paramak, "");
            paramak = new SpannableStringBuilder(paramak);
            paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
            paramak.append(j.b(this.context, str, paramInt));
            AppMethodBeat.o(34380);
          }
        }
      }
    }
    if ((paramBoolean) && ((paramak.field_unReadCount > 1) || (paramak.field_unReadMuteCount > 0)))
      paramak = this.context.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str });
    while (true)
    {
      paramak = j.b(this.context, paramak, paramInt);
      AppMethodBeat.o(34380);
      break;
      if ((com.tencent.mm.storage.s.aVO()) && (t.ny(paramak.field_username)))
      {
        paramBoolean = paramak.jl(16);
        if ((paramak.field_unReadCount > 1) || ((!paramBoolean) && (paramak.field_unReadCount > 0)))
        {
          if (paramBoolean)
          {
            if (paramak.jl(32))
            {
              paramak = this.context.getString(2131301271, new Object[] { Integer.valueOf(paramak.field_unReadCount) });
              localObject2 = this.context.getResources().getDrawable(2130837943);
              ((Drawable)localObject2).setBounds(0, 0, paramInt, paramInt);
              localObject2 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
              localObject3 = new SpannableString("@");
              ((SpannableString)localObject3).setSpan(localObject2, 0, 1, 33);
              paramak = TextUtils.concat(new CharSequence[] { paramak, " ", localObject3, j.b(this.context, str, paramInt) });
              AppMethodBeat.o(34380);
              break;
            }
            paramak = this.context.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str });
            continue;
          }
          paramak = this.context.getString(2131301272, new Object[] { Integer.valueOf(paramak.field_unReadCount), str });
          continue;
        }
        if (paramak.jl(32))
        {
          paramak = this.context.getResources().getDrawable(2130837943);
          paramak.setBounds(0, 0, paramInt, paramInt);
          paramak = new com.tencent.mm.ui.widget.a(paramak);
          localObject2 = new SpannableString("@");
          ((SpannableString)localObject2).setSpan(paramak, 0, 1, 33);
          paramak = TextUtils.concat(new CharSequence[] { localObject2, j.b(this.context, str, paramInt) });
          AppMethodBeat.o(34380);
          break;
        }
      }
      paramak = str;
    }
  }

  private ak d(String paramString, HashMap<String, ak> paramHashMap)
  {
    AppMethodBeat.i(34386);
    if ((paramHashMap != null) && (paramHashMap.containsKey(paramString)))
    {
      paramString = (ak)paramHashMap.get(paramString);
      AppMethodBeat.o(34386);
    }
    while (true)
    {
      return paramString;
      paramString = (ak)cL(paramString);
      AppMethodBeat.o(34386);
    }
  }

  private boolean dIG()
  {
    if (this.ztK != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dII()
  {
    AppMethodBeat.i(34389);
    if ((this.yDY == null) || (this.ztA == null) || (this.ztA.isEmpty()))
    {
      AppMethodBeat.o(34389);
      return;
    }
    ab.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents contactEvents size %d", new Object[] { Integer.valueOf(this.ztA.size()) });
    Iterator localIterator = this.ztA.iterator();
    int i = 0;
    label72: int j;
    boolean bool1;
    while (true)
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        j = i;
        if (str1 == null)
          break label363;
        j = i;
        if (str1.equals(""))
          break label363;
        j = i;
        if (!this.yDY.containsKey(str1))
          break label363;
        d locald = (d)this.yDY.get(str1);
        j = i;
        if (locald == null)
          break label363;
        this.ztN.ju(str1);
        bool1 = t.kH(str1);
        ad localad = this.ztN.dIK();
        if (localad != null)
        {
          String str2 = com.tencent.mm.model.s.a(localad, str1, bool1);
          ab.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents newdisplayname %s old dispalyname %s", new Object[] { str2, locald.eoz });
          j = i;
          if (str2 != null)
          {
            j = i;
            if (!str2.equals(locald.eoz))
            {
              locald.eoz = str2;
              a(locald, localad);
              j = 1;
            }
          }
          boolean bool2 = localad.DX();
          if (localad.dua == 0)
          {
            bool1 = true;
            label268: if ((locald.zrN == bool2) && (bool1 == locald.zrR))
              break label363;
            locald.zrN = bool2;
            locald.zrR = bool1;
            locald.zrS = localad.Kc();
            ab.d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents in cache username %s mute change", new Object[] { str1 });
          }
        }
      }
    label363: for (i = 1; ; i = j)
    {
      break label72;
      bool1 = false;
      break label268;
      if (i != 0)
        notifyDataSetChanged();
      this.ztA.clear();
      AppMethodBeat.o(34389);
      break;
    }
  }

  private void dIq()
  {
    AppMethodBeat.i(34369);
    if (this.yDY == null)
      AppMethodBeat.o(34369);
    while (true)
    {
      return;
      Iterator localIterator = this.yDY.entrySet().iterator();
      while (localIterator.hasNext())
        ((d)((Map.Entry)localIterator.next()).getValue()).zrH = null;
      AppMethodBeat.o(34369);
    }
  }

  private CharSequence h(ak paramak)
  {
    AppMethodBeat.i(34366);
    if (paramak.field_status == 1)
    {
      paramak = this.context.getString(2131301306);
      AppMethodBeat.o(34366);
    }
    while (true)
    {
      return paramak;
      if (paramak.field_conversationTime == 9223372036854775807L)
      {
        paramak = "";
        AppMethodBeat.o(34366);
      }
      else
      {
        paramak = com.tencent.mm.pluginsdk.f.h.c(this.context, paramak.field_conversationTime, true);
        AppMethodBeat.o(34366);
      }
    }
  }

  private static String j(ak paramak)
  {
    AppMethodBeat.i(34381);
    if ((paramak.field_isSend == 0) && (t.kH(paramak.field_username)))
    {
      paramak = com.tencent.mm.model.s.getDisplayName(paramak.field_digestUser, paramak.field_username);
      AppMethodBeat.o(34381);
    }
    while (true)
    {
      return paramak;
      paramak = com.tencent.mm.model.s.mJ(paramak.field_digestUser);
      AppMethodBeat.o(34381);
    }
  }

  public final void Pv(int paramInt)
  {
    AppMethodBeat.i(34372);
    if (!dIG())
    {
      ab.i("MicroMsg.ConversationWithCacheAdapter", "[requestDismissClickStatus] pass!");
      AppMethodBeat.o(34372);
    }
    while (true)
    {
      return;
      al.n(new h.3(this), paramInt);
      AppMethodBeat.o(34372);
    }
  }

  public final void Pw(int paramInt)
  {
    AppMethodBeat.i(34392);
    if ((paramInt < 0) || (paramInt >= getCount()))
      AppMethodBeat.o(34392);
    while (true)
    {
      return;
      try
      {
        ak localak = (ak)MG(paramInt);
        if (localak == null)
          AppMethodBeat.o(34392);
      }
      catch (NullPointerException localNullPointerException)
      {
        Object localObject;
        while (true)
        {
          ab.w("MicroMsg.ConversationWithCacheAdapter", "preLoad position:%s is null!", new Object[] { Integer.valueOf(paramInt) });
          localObject = null;
        }
        a.b.diS().cQ(localObject.field_username);
        AppMethodBeat.o(34392);
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(34388);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.ConversationWithCacheAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(34388);
    }
    while (true)
    {
      return;
      String str = (String)paramObject;
      if ((paramn instanceof be))
      {
        ab.i("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onConversationStorageNotifyChange event type %d, username %s", new Object[] { Integer.valueOf(paramInt), str });
        int j = i;
        if (str.contains("@"))
        {
          j = i;
          if (!str.endsWith("@chatroom"))
          {
            j = i;
            if (!str.endsWith("@im.chatroom"))
            {
              j = i;
              if (!str.endsWith("@micromsg.qq.com"))
                if (!ad.aox(str))
                  break label177;
            }
          }
        }
        label177: for (j = i; ; j = 1)
        {
          if (j == 0)
            break label183;
          AppMethodBeat.o(34388);
          break;
        }
        label183: if (this.yDY != null)
        {
          if (paramObject.equals(""))
          {
            if (paramInt == 5)
            {
              this.ztG = true;
              super.j(null, 1);
              AppMethodBeat.o(34388);
            }
          }
          else
            this.ztF.add(str);
        }
        else
        {
          j = paramInt;
          if (paramInt == 3)
            j = 2;
          super.j(str, j);
          AppMethodBeat.o(34388);
        }
      }
      else if ((paramn instanceof bd))
      {
        ab.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", new Object[] { Integer.valueOf(paramInt), paramObject, Boolean.valueOf(this.nNp) });
        if (this.nNp)
        {
          AppMethodBeat.o(34388);
        }
        else
        {
          this.ztE = true;
          if ((paramInt == 5) || (paramInt == 2))
            AppMethodBeat.o(34388);
          else if ((this.yDY == null) || (!this.yDY.containsKey(str)))
            AppMethodBeat.o(34388);
          else if (this.ztA != null)
            this.ztA.add(str);
        }
      }
      else
      {
        AppMethodBeat.o(34388);
      }
    }
  }

  public final void a(View paramView, int paramInt, String paramString)
  {
    AppMethodBeat.i(34371);
    if (paramView == null)
      AppMethodBeat.o(34371);
    while (true)
    {
      return;
      if (this.ztK == null)
        break;
      ab.w("MicroMsg.ConversationWithCacheAdapter", "[onClickItem] has click! position:%s username:%s", new Object[] { Integer.valueOf(paramInt), paramString });
      AppMethodBeat.o(34371);
    }
    ab.i("MicroMsg.ConversationWithCacheAdapter", "[onClickItem] position:%s username:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    this.ztK = paramString;
    paramString = (h.f)paramView.getTag();
    Resources localResources = paramView.getContext().getResources();
    if ((paramString != null) && (paramString.yDZ));
    for (paramInt = 2131689887; ; paramInt = 2131689911)
    {
      this.ztL = new ColorDrawable(localResources.getColor(paramInt));
      paramView.setBackground(this.ztL);
      AppMethodBeat.o(34371);
      break;
    }
  }

  public final SparseArray<String>[] a(HashSet<f.b<String, ak>> paramHashSet, SparseArray<String>[] paramArrayOfSparseArray)
  {
    AppMethodBeat.i(34385);
    if ((paramArrayOfSparseArray == null) || (paramArrayOfSparseArray.length <= 0) || (!com.tencent.mm.kernel.g.RK()))
      AppMethodBeat.o(34385);
    while (true)
    {
      return paramArrayOfSparseArray;
      ab.d("MicroMsg.ConversationWithCacheAdapter", "refreshPosistion events size %d oldPosistion size %d", new Object[] { Integer.valueOf(paramHashSet.size()), Integer.valueOf(paramArrayOfSparseArray[0].size()) });
      Object localObject1 = new ArrayList();
      Object localObject2 = paramHashSet.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (f.b)((Iterator)localObject2).next();
        if ((localObject3 != null) && (((f.b)localObject3).ygE != 5) && (!((ArrayList)localObject1).contains(((f.b)localObject3).object)))
        {
          ab.d("MicroMsg.ConversationWithCacheAdapter", "searchArray.add(event.object) " + (String)((f.b)localObject3).object);
          ((ArrayList)localObject1).add(((f.b)localObject3).object);
        }
      }
      Object localObject3 = new HashMap();
      aw.ZK();
      Object localObject4 = com.tencent.mm.model.c.XR().a((ArrayList)localObject1, t.fkP, this.elZ, com.tencent.mm.o.a.ewS);
      while (((Cursor)localObject4).moveToNext())
      {
        localObject2 = new ak();
        ((ak)localObject2).d((Cursor)localObject4);
        ((HashMap)localObject3).put(((at)localObject2).field_username, localObject2);
      }
      ((Cursor)localObject4).close();
      localObject4 = paramHashSet.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        f.b localb = (f.b)((Iterator)localObject4).next();
        if (localb != null)
        {
          if (localb.ygE != 5)
          {
            localObject2 = new StringBuilder("evnet name,").append((String)localb.object).append("  event.newObj   ==");
            if (((HashMap)localObject3).get(localb.object) == null);
            for (boolean bool = true; ; bool = false)
            {
              ab.d("MicroMsg.ConversationWithCacheAdapter", bool);
              localb.ygF = ((HashMap)localObject3).get(localb.object);
              break;
            }
          }
          localb.ygF = null;
        }
      }
      ((ArrayList)localObject1).clear();
      ((HashMap)localObject3).clear();
      localObject1 = new HashMap();
      paramHashSet = paramHashSet.iterator();
      while (paramHashSet.hasNext())
      {
        localObject3 = (f.b)paramHashSet.next();
        if (localObject3 != null)
        {
          a((f.b)localObject3, paramArrayOfSparseArray[0], (HashMap)localObject1);
          if (((f.b)localObject3).ygE != 5)
            ((HashMap)localObject1).put(((f.b)localObject3).object, ((f.b)localObject3).ygF);
        }
      }
      AppMethodBeat.o(34385);
    }
  }

  public final ArrayList<ak> ao(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(34384);
    ab.d("MicroMsg.ConversationWithCacheAdapter", "rebulidAllChangeData obj.size() %d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    aw.ZK();
    paramArrayList = com.tencent.mm.model.c.XR().a(paramArrayList, t.fkP, this.elZ, com.tencent.mm.o.a.ewS);
    while (paramArrayList.moveToNext())
    {
      ak localak = new ak();
      localak.d(paramArrayList);
      localArrayList.add(localak);
    }
    paramArrayList.close();
    AppMethodBeat.o(34384);
    return localArrayList;
  }

  public final boolean arV(String paramString)
  {
    AppMethodBeat.i(34391);
    boolean bool;
    if ((this.yDY == null) || (!this.yDY.containsKey(paramString)))
    {
      bool = true;
      AppMethodBeat.o(34391);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34391);
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(34379);
    if (this.yDY != null)
    {
      this.yDY.clear();
      this.ztG = true;
    }
    AppMethodBeat.o(34379);
  }

  public final void dHz()
  {
    boolean bool1 = true;
    AppMethodBeat.i(34367);
    if (this.elZ == null)
      this.elZ = new ArrayList();
    this.elZ.clear();
    int i;
    if ((com.tencent.mm.model.r.YD() & 0x8000) == 0)
    {
      i = 1;
      boolean bool2 = com.tencent.mm.model.r.YQ();
      if ((i == 0) || (!bool2))
        break label139;
      label59: if (bool1 != this.ztH)
      {
        if (!bool1)
          break label144;
        aw.ZK();
        a(5, (com.tencent.mm.sdk.e.n)com.tencent.mm.model.c.XR(), "floatbottle");
      }
    }
    while (true)
    {
      this.ztH = bool1;
      if (this.ztH)
        this.elZ.add("floatbottle");
      this.elZ.add("qmessage");
      AppMethodBeat.o(34367);
      return;
      i = 0;
      break;
      label139: bool1 = false;
      break label59;
      label144: aw.ZK();
      a(2, (com.tencent.mm.sdk.e.n)com.tencent.mm.model.c.XR(), "floatbottle");
    }
  }

  public final void dIH()
  {
    AppMethodBeat.i(34373);
    super.j(null, 1);
    AppMethodBeat.o(34373);
  }

  public final boolean dvr()
  {
    AppMethodBeat.i(34390);
    boolean bool = super.dvr();
    AppMethodBeat.o(34390);
    return bool;
  }

  public final com.tencent.mm.cd.a.d dwz()
  {
    AppMethodBeat.i(34383);
    ab.d("MicroMsg.ConversationWithCacheAdapter", "createCursor");
    aw.ZK();
    com.tencent.mm.cd.a.d locald = (com.tencent.mm.cd.a.d)com.tencent.mm.model.c.XR().a(t.fkP, this.elZ, com.tencent.mm.o.a.ewS, true);
    AppMethodBeat.o(34383);
    return locald;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34374);
    this.ztP = new a((byte)0);
    ak localak = (ak)MG(paramInt);
    String str = localak.field_username;
    this.ztN.ju(str);
    Object localObject1;
    int j;
    Object localObject3;
    label243: boolean bool;
    if (this.ztC.containsKey(str))
    {
      if (paramInt != ((Integer)this.ztC.get(str)).intValue())
      {
        localObject1 = dwA();
        int i;
        if (this.ygs == null)
        {
          paramViewGroup = null;
          localObject2 = new StringBuffer();
          i = localObject1.length;
        }
        for (j = 0; ; j++)
        {
          if (j >= i)
            break label243;
          localObject3 = localObject1[j];
          int k = 0;
          while (true)
            if ((k < ((SparseArray)localObject3).size()) && (k < 50))
            {
              ((StringBuffer)localObject2).append("[");
              ((StringBuffer)localObject2).append(k);
              ((StringBuffer)localObject2).append(",");
              ((StringBuffer)localObject2).append(((SparseArray)localObject3).keyAt(k));
              ((StringBuffer)localObject2).append(",");
              ((StringBuffer)localObject2).append((String)((SparseArray)localObject3).valueAt(k));
              ((StringBuffer)localObject2).append("]");
              k++;
              continue;
              paramViewGroup = this.ygs.ycB.dvq();
              break;
            }
        }
        ((StringBuffer)localObject2).append("\n");
        if (paramViewGroup != null)
        {
          localObject1 = paramViewGroup.entrySet().iterator();
          j = 0;
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (Map.Entry)((Iterator)localObject1).next();
            if (j >= 50)
              break;
            j++;
            ((StringBuffer)localObject2).append("[");
            ((StringBuffer)localObject2).append(((Map.Entry)localObject3).getKey());
            ((StringBuffer)localObject2).append(",");
            if (((Map.Entry)localObject3).getValue() != null)
              ((StringBuffer)localObject2).append(((ak)((Map.Entry)localObject3).getValue()).field_username);
            ((StringBuffer)localObject2).append("]");
          }
          ((StringBuffer)localObject2).append("\n");
        }
        localObject1 = ((StringBuffer)localObject2).toString();
        localObject2 = this.ztC.toString();
        if (paramViewGroup == null)
          break label1968;
        j = paramViewGroup.size();
        ab.i("MicroMsg.ConversationWithCacheAdapter", "Get Item duplicated: positionMaps: %s username [%s, %d] Map: %s datas: %d", new Object[] { localObject1, str, Integer.valueOf(paramInt), localObject2, Integer.valueOf(j) });
        if (!this.ztB)
        {
          e.vV(20);
          this.ztB = true;
        }
        if (System.currentTimeMillis() - this.ztQ > 3600000L)
        {
          super.j(null, 1);
          this.ztQ = System.currentTimeMillis();
        }
      }
      label496: if (paramView != null)
        break label2047;
      localObject1 = new h.f();
      if (!com.tencent.mm.bz.a.ga(this.context))
        break label1991;
      paramView = com.tencent.mm.kiss.a.b.SM().a((Activity)this.context, "R.layout.conversation_item_with_cache_large", 2130969244);
      label539: paramView.setTag(2131820679, new int[2]);
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(34360);
          if ((h.g(h.this) == null) || (h.g(h.this).getOnItemClickListener() == null))
          {
            ab.e("MicroMsg.ConversationWithCacheAdapter", "[onClick] pass this click");
            AppMethodBeat.o(34360);
          }
          while (true)
          {
            return;
            if (paramAnonymousView.getTag() == null)
            {
              ab.e("MicroMsg.ConversationWithCacheAdapter", "[onClick] getTag is null");
              AppMethodBeat.o(34360);
            }
            else if (!h.this.yOf)
            {
              ab.w("MicroMsg.ConversationWithCacheAdapter", "[onClick] unResume");
              AppMethodBeat.o(34360);
            }
            else
            {
              h.f localf = (h.f)paramAnonymousView.getTag();
              int i = localf.position;
              int j = h.g(h.this).getHeaderViewsCount();
              h.g(h.this).getOnItemClickListener().onItemClick(h.g(h.this), paramAnonymousView, i + j, h.this.getItemId(localf.position));
              AppMethodBeat.o(34360);
            }
          }
        }
      });
      paramView.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          boolean bool = false;
          AppMethodBeat.i(34361);
          if ((h.g(h.this) == null) || (h.g(h.this).getOnItemLongClickListener() == null))
          {
            ab.e("MicroMsg.ConversationWithCacheAdapter", "[onClick] pass this click");
            AppMethodBeat.o(34361);
          }
          while (true)
          {
            return bool;
            if (paramAnonymousView.getTag() == null)
            {
              ab.e("MicroMsg.ConversationWithCacheAdapter", "[onClick] getTag is null");
              AppMethodBeat.o(34361);
            }
            else if (!h.this.yOf)
            {
              ab.w("MicroMsg.ConversationWithCacheAdapter", "[onClick] unResume");
              AppMethodBeat.o(34361);
            }
            else
            {
              h.f localf = (h.f)paramAnonymousView.getTag();
              int i = localf.position;
              int j = h.g(h.this).getHeaderViewsCount();
              bool = h.g(h.this).getOnItemLongClickListener().onItemLongClick(h.g(h.this), paramAnonymousView, i + j, h.this.getItemId(localf.position));
              AppMethodBeat.o(34361);
            }
          }
        }
      });
      ((h.f)localObject1).ejo = ((ImageView)paramView.findViewById(2131821183));
      a.b.b(((h.f)localObject1).ejo, str);
      paramViewGroup = (com.tencent.mm.pluginsdk.ui.a)((h.f)localObject1).ejo.getDrawable();
      if (this.zro != null)
        this.zro.a(paramViewGroup);
      ((h.f)localObject1).yEc = ((NoMeasuredTextView)paramView.findViewById(2131823149));
      ((h.f)localObject1).yEc.setLayoutCallback(this.ztI);
      ((h.f)localObject1).yEd = ((NoMeasuredTextView)paramView.findViewById(2131823150));
      ((h.f)localObject1).zud = ((ImageView)paramView.findViewById(2131823157));
      ((h.f)localObject1).yEe = ((NoMeasuredTextView)paramView.findViewById(2131823151));
      ((h.f)localObject1).jJV = ((TextView)paramView.findViewById(2131821067));
      ((h.f)localObject1).yEf = ((ImageView)paramView.findViewById(2131823153));
      ((h.f)localObject1).yEh = paramView.findViewById(2131823148);
      ((h.f)localObject1).yEg = ((ImageView)paramView.findViewById(2131823154));
      ((h.f)localObject1).zrW = ((ImageView)paramView.findViewById(2131823155));
      ((h.f)localObject1).zue = ((ImageView)paramView.findViewById(2131823152));
      ((h.f)localObject1).jJV.setBackgroundResource(com.tencent.mm.ui.tools.r.ik(this.context));
      ((h.f)localObject1).zuf = new c();
      paramView.setTag(localObject1);
      ((h.f)localObject1).yEe.setTextSize(0, com.tencent.mm.bz.a.al(this.context, 2131427864));
      ((h.f)localObject1).yEd.setTextSize(0, com.tencent.mm.bz.a.al(this.context, 2131427866));
      ((h.f)localObject1).yEc.setTextSize(0, com.tencent.mm.bz.a.al(this.context, 2131427813));
      this.ztO = ((h.f)localObject1).yEc.getTextSize();
      ((h.f)localObject1).yEe.setTextColor(this.yDX[0]);
      ((h.f)localObject1).yEd.setTextColor(this.yDX[4]);
      ((h.f)localObject1).yEc.setTextColor(this.yDX[3]);
      ((h.f)localObject1).yEe.setShouldEllipsize(true);
      ((h.f)localObject1).yEd.setShouldEllipsize(false);
      ((h.f)localObject1).yEc.setShouldEllipsize(true);
      ((h.f)localObject1).yEd.setGravity(5);
      paramViewGroup = paramView;
      label968: localObject3 = i(localak);
      ((h.f)localObject1).position = paramInt;
      ((h.f)localObject1).username = str;
      if ((!((d)localObject3).yDZ) || (localak.field_conversationTime == -1L))
        break label2061;
      bool = true;
      label1012: ((h.f)localObject1).yDZ = bool;
      if (((d)localObject3).zrI == null)
        ((d)localObject3).zrI = b(localak, (int)((h.f)localObject1).yEe.getTextSize(), ((d)localObject3).zrP);
      if (((d)localObject3).zrH == null)
        ((d)localObject3).zrH = h(localak);
      if (!((d)localObject3).zrP)
        break label2067;
      ((h.f)localObject1).yEe.setTextColor(this.yDX[0]);
      label1093: com.tencent.mm.booter.notification.a.h.iv(((h.f)localObject1).yEe.getWidth());
      com.tencent.mm.booter.notification.a.h.iw((int)((h.f)localObject1).yEe.getTextSize());
      com.tencent.mm.booter.notification.a.h.a(((h.f)localObject1).yEe.getPaint());
      if (!t.mP(str))
        break label2088;
      ((h.f)localObject1).yEc.setCompoundRightDrawablesWithIntrinsicBounds(2131231778);
      ((h.f)localObject1).yEc.setDrawRightDrawable(true);
      label1155: paramInt = ((d)localObject3).zrJ;
      if (paramInt == -1)
        break label2111;
      ((h.f)localObject1).yEe.setCompoundLeftDrawablesWithIntrinsicBounds(paramInt);
      ((h.f)localObject1).yEe.setDrawLeftDrawable(true);
      ab.i("MicroMsg.ConversationWithCacheAdapter", "userName:%s, status:%d", new Object[] { str, Integer.valueOf(((d)localObject3).zrJ) });
      label1212: if (!ad.aox(localak.field_username))
        break label2145;
      this.ztN.ju(localak.field_username);
      ad localad = this.ztN.dIK();
      paramView = "";
      if (localad != null)
        paramView = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).ba(localad.field_openImAppid, localad.field_descWordingId);
      if (com.tencent.mm.platformtools.ah.isNullOrNil(paramView))
        break label2131;
      Object localObject2 = paramView;
      if ("3552365301".equals(localad.field_openImAppid))
        localObject2 = "@".concat(String.valueOf(paramView));
      ((h.f)localObject1).yEc.au((String)localObject2, 2131690194, 14);
      label1328: ((h.f)localObject1).yEc.setText(((d)localObject3).nickName);
      paramView = ((h.f)localObject1).yEd.getLayoutParams();
      if (((d)localObject3).zrH.length() < 9)
        break label2168;
      if (paramView.width != this.zry)
      {
        paramView.width = this.zry;
        ((h.f)localObject1).yEd.setLayoutParams(paramView);
      }
      label1393: ((h.f)localObject1).yEd.setText(((d)localObject3).zrH);
      ((h.f)localObject1).yEe.setText(((d)localObject3).zrI);
      ((h.f)localObject1).zud.setVisibility(8);
      ((h.f)localObject1).yEf.setVisibility(8);
      if (!((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mp(str))
        break label2199;
      ((h.f)localObject1).yEf.setVisibility(0);
      ((h.f)localObject1).yEf.setImageResource(2131231066);
      label1478: a.b.b(((h.f)localObject1).ejo, str);
      if (this.zrm)
      {
        if ((localak != null) && (localObject1 != null) && (localObject3 != null))
          break label2258;
        ab.w("MicroMsg.ConversationWithCacheAdapter", "handle show tip cnt, but conversation or viewholder is null");
      }
      label1518: if ((!((d)localObject3).zrM) && (((d)localObject3).yDZ) && (aw.RK()))
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().f(localak);
      }
      if ((this.ztK == null) || (!this.ztK.equals(str)))
        break label2515;
      ab.i("MicroMsg.ConversationWithCacheAdapter", "convertView:%s, clickUsername:%s", new Object[] { Integer.valueOf(paramViewGroup.hashCode()), this.ztK });
      paramViewGroup.findViewById(2131823147).setBackground(this.ztL);
      label1617: if (Build.VERSION.SDK_INT >= 21)
        paramViewGroup.findViewById(2131823147).setOnTouchListener(new View.OnTouchListener()
        {
          @TargetApi(21)
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            AppMethodBeat.i(34362);
            paramAnonymousView.findViewById(2131823147).getBackground().setHotspot(paramAnonymousMotionEvent.getX(), paramAnonymousMotionEvent.getY());
            AppMethodBeat.o(34362);
            return false;
          }
        });
      com.tencent.mm.bp.d.dlL();
      if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 7, 0L)) && (!localak.field_username.equals(this.zty.cPg.cPj)))
      {
        localak.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 6, localak.field_conversationTime));
        aw.ZK();
        com.tencent.mm.model.c.XR().a(localak, localak.field_username);
      }
      if ((com.tencent.mm.bg.g.fUs != null) && (com.tencent.mm.bg.g.fUs.tN(localak.field_username)))
        break label2567;
      ((h.f)localObject1).yEg.setVisibility(8);
      label1750: if ((com.tencent.mm.bh.d.fUu == null) || (!com.tencent.mm.bh.d.fUu.tQ(localak.field_username)))
        break label2625;
      ((h.f)localObject1).zrW.setVisibility(0);
      label1781: if ((!t.kH(localak.field_username)) || (com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class) == null) || (!((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RX(localak.field_username)))
        break label2652;
      if ((!((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bRc()) || (!((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).ff(localak.field_username, com.tencent.mm.model.r.Yz())))
        break label2638;
      ((h.f)localObject1).zue.setImageResource(2131231081);
      label1876: ((h.f)localObject1).zue.setVisibility(0);
    }
    while (true)
    {
      this.ztP.content = String.valueOf(((d)localObject3).zrI);
      this.ztP.bCu = ((d)localObject3).eoz;
      this.ztP.zrG = String.valueOf(((d)localObject3).zrH);
      paramView = this.ztP;
      a.a.dzk().a(paramViewGroup, paramView.bCu, paramView.zrF, paramView.zrG, paramView.content);
      paramViewGroup.setAlpha(1.0F);
      AppMethodBeat.o(34374);
      return paramViewGroup;
      label1968: j = 0;
      break;
      this.ztC.put(str, Integer.valueOf(paramInt));
      break label496;
      label1991: if (com.tencent.mm.bz.a.gc(this.context))
      {
        paramView = com.tencent.mm.kiss.a.b.SM().a((Activity)this.context, "R.layout.conversation_item_with_cache_small", 2130969245);
        break label539;
      }
      paramView = com.tencent.mm.kiss.a.b.SM().a((Activity)this.context, "R.layout.conversation_item_with_cache", 2130969243);
      break label539;
      label2047: localObject1 = (h.f)paramView.getTag();
      paramViewGroup = paramView;
      break label968;
      label2061: bool = false;
      break label1012;
      label2067: ((h.f)localObject1).yEe.setTextColor(this.yDX[localObject3.klY]);
      break label1093;
      label2088: if (!((h.f)localObject1).yEc.yzV)
        break label1155;
      ((h.f)localObject1).yEc.setDrawRightDrawable(false);
      break label1155;
      label2111: ((h.f)localObject1).yEe.setDrawLeftDrawable(false);
      ((h.f)localObject1).yEe.invalidate();
      break label1212;
      label2131: ((h.f)localObject1).yEc.au(null, 0, 0);
      break label1328;
      label2145: t.mP(localak.field_username);
      ((h.f)localObject1).yEc.au(null, 0, 0);
      break label1328;
      label2168: if (paramView.width == this.zrx)
        break label1393;
      paramView.width = this.zrx;
      ((h.f)localObject1).yEd.setLayoutParams(paramView);
      break label1393;
      label2199: ((h.f)localObject1).yEf.setImageResource(2131231068);
      if (((d)localObject3).mgQ)
      {
        if (!((d)localObject3).zrR)
          break label1478;
        ((h.f)localObject1).yEf.setVisibility(0);
        break label1478;
      }
      if (!((d)localObject3).zrN)
        break label1478;
      ((h.f)localObject1).yEf.setVisibility(0);
      break label1478;
      label2258: ((h.f)localObject1).jJV.setVisibility(4);
      ((h.f)localObject1).yEh.setVisibility(4);
      if ((!t.mU(localak.field_username)) && (((d)localObject3).zrQ) && ((((d)localObject3).zrL == 1) || (((d)localObject3).zrL == 2) || (((d)localObject3).zrL == 3)));
      for (paramView = this.yDX[2]; ; paramView = this.yDX[3])
      {
        ((h.f)localObject1).yEc.setTextColor(paramView);
        if ((((d)localObject3).zrQ) && (((d)localObject3).zrK != 0))
          break label2375;
        ab.w("MicroMsg.ConversationWithCacheAdapter", "handle show tip count, but talker is null");
        break;
      }
      label2375: paramInt = a(localak, (d)localObject3);
      if (paramInt == 1)
      {
        ((h.f)localObject1).yEh.setVisibility(0);
        break label1518;
      }
      if (paramInt != 2)
        break label1518;
      paramInt = localak.field_unReadCount;
      if (paramInt > 99)
      {
        ((h.f)localObject1).jJV.setText("");
        ((h.f)localObject1).jJV.setBackgroundResource(2131230952);
        ((h.f)localObject1).jJV.setVisibility(0);
      }
      while (true)
      {
        this.ztP.zrF = paramInt;
        break;
        if (paramInt > 0)
        {
          ((h.f)localObject1).jJV.setText(localak.field_unReadCount);
          ((h.f)localObject1).jJV.setVisibility(0);
          ((h.f)localObject1).jJV.setBackgroundResource(com.tencent.mm.ui.tools.r.ik(this.context));
        }
      }
      label2515: if ((((d)localObject3).yDZ) && (localak.field_conversationTime != -1L))
      {
        paramViewGroup.findViewById(2131823147).setBackgroundResource(2130839165);
        break label1617;
      }
      paramViewGroup.findViewById(2131823147).setBackgroundResource(2130838427);
      break label1617;
      label2567: ((h.f)localObject1).yEg.setVisibility(0);
      if (localak.field_username.equals(this.zty.cPg.cPj))
      {
        ((h.f)localObject1).yEg.setImageResource(2131232016);
        break label1750;
      }
      ((h.f)localObject1).yEg.setImageResource(2131232015);
      break label1750;
      label2625: ((h.f)localObject1).zrW.setVisibility(8);
      break label1781;
      label2638: ((h.f)localObject1).zue.setImageResource(2131231082);
      break label1876;
      label2652: ((h.f)localObject1).zue.setVisibility(8);
    }
  }

  final d i(ak paramak)
  {
    boolean bool1 = true;
    AppMethodBeat.i(34375);
    String str1 = paramak.field_username;
    Object localObject;
    if (this.yDY != null)
    {
      localObject = (d)this.yDY.get(str1);
      if (localObject != null)
      {
        AppMethodBeat.o(34375);
        paramak = (ak)localObject;
        return paramak;
      }
    }
    d locald = new d((byte)0);
    this.ztN.ju(str1);
    ad localad = this.ztN.dIK();
    if (localad != null)
    {
      locald.zrL = localad.duk;
      locald.zrK = ((int)localad.ewQ);
      label103: if (localad == null)
        break label553;
      bool2 = true;
      label111: locald.zrQ = bool2;
      if ((localad == null) || (!localad.Kc()))
        break label559;
      bool2 = true;
      label134: locald.zrS = bool2;
      if ((localad == null) || (localad.dua != 0))
        break label565;
      bool2 = true;
      label157: locald.zrR = bool2;
      locald.mgQ = t.mN(str1);
      if ((!locald.mgQ) || (!locald.zrR) || (paramak.field_unReadCount <= 0))
        break label571;
      bool2 = true;
      label199: locald.zrP = bool2;
      locald.klY = 0;
      if ((FB(paramak.field_msgType) == 34) && (paramak.field_isSend == 0) && (!com.tencent.mm.platformtools.ah.isNullOrNil(paramak.field_content)))
      {
        String str2 = paramak.field_content;
        if ((!str1.equals("qmessage")) && (!str1.equals("floatbottle")) && (!str1.equals("officialaccounts")) && (!paramak.jl(2097152)))
        {
          localObject = str2;
          if (!paramak.jl(8388608));
        }
        else
        {
          String[] arrayOfString = str2.split(":");
          localObject = str2;
          if (arrayOfString != null)
          {
            localObject = str2;
            if (arrayOfString.length > 3)
              localObject = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
          }
        }
        if (!new com.tencent.mm.modelvoice.n((String)localObject).fWX)
          locald.klY = 1;
      }
      if ((!com.tencent.mm.storage.s.aVO()) || (!t.ny(str1)))
        break label577;
      locald.eoz = this.context.getResources().getString(2131297684);
      label428: a(locald, localad);
      locald.zrH = h(paramak);
      locald.zrJ = Pu(paramak.field_status);
      locald.zrM = t.a(paramak);
      aw.ZK();
      locald.yDZ = com.tencent.mm.model.c.XR().g(paramak);
      if ((localad == null) || (!localad.DX()))
        break label596;
    }
    label553: label559: label565: label571: label577: label596: for (boolean bool2 = bool1; ; bool2 = false)
    {
      locald.zrN = bool2;
      if (this.yDY != null)
        this.yDY.put(str1, locald);
      AppMethodBeat.o(34375);
      paramak = locald;
      break;
      locald.zrL = -1;
      locald.zrK = -1;
      break label103;
      bool2 = false;
      break label111;
      bool2 = false;
      break label134;
      bool2 = false;
      break label157;
      bool2 = false;
      break label199;
      locald.eoz = com.tencent.mm.model.s.a(localad, str1, locald.mgQ);
      break label428;
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(34393);
    if (!this.ztR)
    {
      super.notifyDataSetChanged();
      this.ztC.clear();
    }
    ab.i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
    AppMethodBeat.o(34393);
  }

  public final void onPause()
  {
    AppMethodBeat.i(34368);
    ab.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onPause  hasResume " + this.yOf);
    if (!this.yOf)
      AppMethodBeat.o(34368);
    while (true)
    {
      return;
      this.yOf = false;
      super.pause();
      if (this.jJR != null)
        this.jJR.bIp();
      AppMethodBeat.o(34368);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(34370);
    ab.d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onResume  hasResume " + this.yOf);
    if (this.yOf)
    {
      AppMethodBeat.o(34370);
      return;
    }
    this.yOf = true;
    dHz();
    dII();
    ab.i(this.TAG, "newcursor resume syncNow ");
    this.ygr = true;
    pA(true);
    Object localObject = new Time();
    ((Time)localObject).setToNow();
    String str = com.tencent.mm.pluginsdk.f.g.a("MM/dd", (Time)localObject).toString();
    localObject = aa.dor();
    if ((!this.zrv.equals(str)) || (!this.ztJ.equals(localObject)));
    for (int i = 1; ; i = 0)
    {
      this.zrv = str;
      this.ztJ = ((String)localObject);
      if (i != 0)
        dIq();
      if ((this.zrq) && (this.ztz != null))
      {
        this.ztz.dIJ();
        this.zrq = false;
        super.j(null, 1);
      }
      this.zty = new sz();
      this.zty.cPf.cPh = true;
      com.tencent.mm.sdk.b.a.xxA.m(this.zty);
      AppMethodBeat.o(34370);
      break;
    }
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  final class a
  {
    public String bCu;
    public String content;
    public int zrF;
    public String zrG;

    private a()
    {
    }
  }

  final class c
  {
    public View jJW = null;
    public TextView jJX = null;
    String username = "";
    public View ywu = null;
    boolean ztV = false;
    boolean ztW = false;
    boolean ztX = false;
    boolean ztY = false;
    boolean ztZ = false;
    public ImageView zua = null;
    public TextView zub = null;
    public View zuc = null;

    c()
    {
    }
  }

  final class d
  {
    public String eoz;
    public int klY;
    public boolean mgQ;
    public CharSequence nickName;
    public boolean yDZ;
    public CharSequence zrH;
    public CharSequence zrI;
    public int zrJ;
    public int zrK;
    public int zrL;
    public boolean zrM;
    public boolean zrN;
    public boolean zrP;
    public boolean zrQ;
    public boolean zrR;
    public boolean zrS;

    private d()
    {
    }
  }

  final class e
  {
    private ad ehM = null;
    private boolean initialized = false;
    private String talker = null;
    private Integer zrU = null;

    public e()
    {
    }

    public final ad dIK()
    {
      AppMethodBeat.i(34364);
      if ((this.initialized) && (this.ehM == null) && (aw.RK()))
      {
        aw.ZK();
        this.ehM = com.tencent.mm.model.c.XM().aoO(this.talker);
      }
      ad localad = this.ehM;
      AppMethodBeat.o(34364);
      return localad;
    }

    public final void ju(String paramString)
    {
      AppMethodBeat.i(34363);
      this.talker = paramString;
      this.ehM = null;
      this.zrU = null;
      this.initialized = false;
      if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramString))
        this.initialized = true;
      AppMethodBeat.o(34363);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.h
 * JD-Core Version:    0.6.2
 */