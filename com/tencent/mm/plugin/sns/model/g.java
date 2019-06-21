package com.tencent.mm.plugin.sns.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f.b;
import com.tencent.mm.memory.a.b.a;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.x;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.blk;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class g
  implements com.tencent.mm.plugin.sns.b.f
{
  private static int qIq = 0;
  private Map<Integer, WeakReference<Object>> fEk;
  public boolean qHJ;
  private long qHT;
  private long qHU;
  com.tencent.mm.memory.a.b<com.tencent.mm.memory.n> qHV;
  private al<String, WeakReference<Bitmap>> qHW;
  private Map<String, LinkedList<WeakReference<g.c>>> qHX;
  private ConcurrentHashMap<Integer, String> qHY;
  private LinkedList<g.b> qHZ;
  private boolean qIa;
  private HashSet<g.c> qIb;
  public HashMap<String, Integer> qIc;
  private int qId;
  public x qIe;
  public long qIf;
  public long qIg;
  private int qIh;
  private int qIi;
  private HashMap<Long, Integer> qIj;
  private HashMap<Integer, Boolean> qIk;
  private HashMap<Integer, Boolean> qIl;
  private int qIm;
  private int qIn;
  private HashMap<Long, Integer> qIo;
  protected Set<String> qIp;

  public g()
  {
    AppMethodBeat.i(36159);
    this.qHT = 0L;
    this.qHU = 0L;
    this.fEk = new HashMap();
    this.qHX = new HashMap();
    this.qHY = new ConcurrentHashMap();
    this.qHZ = new LinkedList();
    this.qIa = false;
    this.qIb = new HashSet();
    this.qIc = new HashMap();
    this.qId = 4;
    this.qHJ = true;
    this.qIf = 0L;
    this.qIg = 0L;
    this.qIh = 0;
    this.qIi = 0;
    this.qIj = new HashMap();
    this.qIk = new HashMap();
    this.qIl = new HashMap();
    this.qIm = 0;
    this.qIn = 0;
    this.qIo = new HashMap();
    this.qIp = new HashSet();
    com.tencent.mm.memory.a.b.a(com.tencent.mm.memory.n.class, new b.a()
    {
    });
    int i = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    ab.i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i > 256);
    for (i = 62914560; ; i = 31457280)
    {
      this.qHV = new com.tencent.mm.memory.a.b(i, new f.b()
      {
      }
      , getClass());
      this.qHW = new al(this.qId, new al.a()
      {
        public final boolean cn(Object paramAnonymousObject)
        {
          boolean bool1 = true;
          AppMethodBeat.i(36139);
          String str = (String)paramAnonymousObject;
          Object localObject;
          if (g.a(g.this, str))
            localObject = g.a(g.this);
          while (true)
          {
            try
            {
              paramAnonymousObject = ((al.b)((al)localObject).qMs.get(str)).obj;
              if ((paramAnonymousObject instanceof Bitmap))
              {
                paramAnonymousObject = (Bitmap)paramAnonymousObject;
                if ((paramAnonymousObject != null) && (!paramAnonymousObject.isRecycled()))
                {
                  ab.d("MicroMsg.SnsLRUMap", "remove key:".concat(String.valueOf(str)));
                  paramAnonymousObject.recycle();
                }
                int i = ((al)localObject).qMs.size();
                paramAnonymousObject = ((al)localObject).qMs.remove(str);
                localObject = new StringBuilder("internalMap ").append(((al)localObject).qMs.size()).append(" bfSize :").append(i).append(" o == null ");
                if (paramAnonymousObject != null)
                {
                  bool2 = true;
                  ab.d("MicroMsg.SnsLRUMap", bool2);
                  ab.i("MicroMsg.LazyerImageLoader2", "keys " + str + " deRef ok  Big:size:" + g.a(g.this).qMs.size() + " listPaitSize:" + g.b(g.this).size());
                  AppMethodBeat.o(36139);
                  bool2 = bool1;
                  return bool2;
                }
              }
              else
              {
                paramAnonymousObject = (WeakReference)((al.b)((al)localObject).qMs.get(str)).obj;
                if (paramAnonymousObject == null)
                  break label325;
                paramAnonymousObject = (Bitmap)paramAnonymousObject.get();
                continue;
              }
            }
            catch (Exception paramAnonymousObject)
            {
              ab.printErrStackTrace("MicroMsg.SnsLRUMap", paramAnonymousObject, "", new Object[0]);
              ab.e("MicroMsg.SnsLRUMap", "can not recycled forceRemove ");
              continue;
              bool2 = false;
              continue;
            }
            AppMethodBeat.o(36139);
            boolean bool2 = false;
            continue;
            label325: paramAnonymousObject = null;
          }
        }
      });
      AppMethodBeat.o(36159);
      return;
    }
  }

  public static String C(bau parambau)
  {
    AppMethodBeat.i(36217);
    if (parambau == null)
    {
      parambau = null;
      AppMethodBeat.o(36217);
      return parambau;
    }
    if (parambau.Id.startsWith("pre_temp_sns_pic"))
      parambau = af.getAccSnsTmpPath() + parambau.Id;
    while (true)
    {
      AppMethodBeat.o(36217);
      break;
      if (parambau.Id.startsWith("Locall_path"))
        parambau = an.fZ(af.getAccSnsPath(), parambau.Id) + i.m(parambau);
      else if (parambau.Id.startsWith("pre_temp_extend_pic"))
        parambau = parambau.Id.substring(19);
      else
        parambau = an.fZ(af.getAccSnsPath(), parambau.Id) + i.d(parambau);
    }
  }

  private com.tencent.mm.memory.n XL(String paramString)
  {
    AppMethodBeat.i(36170);
    com.tencent.mm.memory.n localn = (com.tencent.mm.memory.n)this.qHV.get(paramString);
    if ((localn == null) || (localn.isRecycled()))
    {
      this.qHV.remove(paramString);
      paramString = null;
      AppMethodBeat.o(36170);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(36170);
      paramString = localn;
    }
  }

  public static Bitmap a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, az paramaz)
  {
    AppMethodBeat.i(36214);
    if ((!paramBoolean) && (bo.isNullOrNil(paramString1)))
    {
      AppMethodBeat.o(36214);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      bau localbau = com.tencent.mm.modelsns.e.a(paramString3, 2, paramString2, paramString2, 1, 1, "");
      i.bc(2, paramString3);
      if (paramString3.equals(""))
      {
        paramString1 = i.Xj(paramString1);
        if (i.B(paramString1))
        {
          AppMethodBeat.o(36214);
        }
        else
        {
          AppMethodBeat.o(36214);
          paramString1 = null;
        }
      }
      else if (i.B(null))
      {
        AppMethodBeat.o(36214);
        paramString1 = null;
      }
      else
      {
        Object localObject = i.l(localbau);
        localObject = i.Xj(an.fZ(af.getAccSnsPath(), paramString3) + (String)localObject);
        paramString3 = (String)localObject;
        if (!i.B((Bitmap)localObject))
          paramString3 = i.Xj(paramString1);
        if ((paramString3 == null) && (paramBoolean) && (!bo.isNullOrNil(paramString2)))
          af.cnA().a(localbau, 3, null, paramaz);
        if (!i.B(paramString3))
        {
          AppMethodBeat.o(36214);
          paramString1 = null;
        }
        else
        {
          AppMethodBeat.o(36214);
          paramString1 = paramString3;
        }
      }
    }
  }

  private String a(com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, az paramaz, boolean paramBoolean)
  {
    AppMethodBeat.i(36207);
    if (u(parambau))
    {
      paramn = "";
      AppMethodBeat.o(36207);
    }
    while (true)
    {
      return paramn;
      String str1 = an.fZ(af.getAccSnsPath(), parambau.Id);
      String str2 = i.j(parambau);
      if (com.tencent.mm.vfs.e.ct(str1 + str2))
      {
        paramn = str1 + str2;
        AppMethodBeat.o(36207);
      }
      else if ((com.tencent.mm.vfs.e.ct(str1 + i.p(parambau))) && (parambau.Id != null) && (parambau.Id.startsWith("Locall_path")))
      {
        paramn = str1 + i.p(parambau);
        AppMethodBeat.o(36207);
      }
      else
      {
        if (this.qHJ)
          break;
        paramn = "";
        AppMethodBeat.o(36207);
      }
    }
    ab.i("MicroMsg.LazyerImageLoader2", "push sight loader " + parambau.Id + " url: " + parambau.Url);
    if (paramBoolean)
      if (b(paramn, null) == 5)
        af.bCo().postDelayed(new g.11(this, parambau, paramaz), 0L);
    while (true)
    {
      paramn = "";
      AppMethodBeat.o(36207);
      break;
      ab.i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
    }
  }

  private void a(View paramView, String paramString, int paramInt, g.a parama)
  {
    AppMethodBeat.i(36186);
    a(paramView, paramString, true, -1, paramInt, -1, -1, parama);
    AppMethodBeat.o(36186);
  }

  private void a(Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36187);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, g.a.qIF);
    AppMethodBeat.o(36187);
  }

  private void a(Object paramObject, String paramString, int paramInt1, int paramInt2, g.a parama)
  {
    AppMethodBeat.i(36188);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, parama);
    AppMethodBeat.o(36188);
  }

  private static void a(Object paramObject, String paramString, com.tencent.mm.memory.n paramn)
  {
    long l1 = 0L;
    AppMethodBeat.i(36175);
    if (paramObject == null)
    {
      AppMethodBeat.o(36175);
      return;
    }
    if (paramn != null)
      ab.i("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", new Object[] { paramObject, paramString, paramn.Xm() });
    Object localObject;
    long l2;
    if ((paramObject instanceof QFadeImageView))
    {
      paramObject = (QFadeImageView)paramObject;
      localObject = paramObject.getDrawable();
      l2 = l1;
      if (!bo.isNullOrNil(paramObject.getImageKey()))
      {
        l2 = l1;
        if (paramObject.getImageKey().equals(paramString))
          l2 = paramObject.getStartTimeMillis();
      }
      if ((localObject == null) || (!(localObject instanceof ai)))
        break label385;
      l2 = ((ai)localObject).mSd;
    }
    label385: 
    while (true)
    {
      paramn = new ai(paramString, paramn, l2);
      paramObject.D(paramn.mSd, paramString);
      paramObject.setImageDrawable(paramn);
      paramn.invalidateSelf();
      AppMethodBeat.o(36175);
      break;
      if ((paramObject instanceof QDisFadeImageView))
      {
        paramObject = (QDisFadeImageView)paramObject;
        paramString = new com.tencent.mm.memory.b.a(paramString, paramn);
        paramObject.setImageDrawable(paramString);
        paramString.invalidateSelf();
        AppMethodBeat.o(36175);
        break;
      }
      if ((paramObject instanceof ImageView))
      {
        localObject = (ImageView)paramObject;
        paramObject = ((ImageView)localObject).getDrawable();
        if ((paramObject != null) && ((paramObject instanceof ai)));
        for (paramObject = new ai(paramString, paramn, ((ai)paramObject).mSd); ; paramObject = new ai(paramString, paramn, 0L))
        {
          ((ImageView)localObject).setImageDrawable(paramObject);
          paramObject.invalidateSelf();
          AppMethodBeat.o(36175);
          break;
        }
      }
      if ((paramObject instanceof com.tencent.mm.plugin.sight.decode.a.a))
      {
        ab.i("MicroMsg.LazyerImageLoader2", "update sight thumb ".concat(String.valueOf(paramString)));
        if ((paramObject instanceof SightPlayImageView))
        {
          localObject = (SightPlayImageView)paramObject;
          paramObject = ((SightPlayImageView)localObject).getDrawable();
          if ((paramObject == null) || (!(paramObject instanceof ai)))
            break label371;
        }
      }
      label371: for (paramObject = new ai(paramString, paramn, ((ai)paramObject).mSd); ; paramObject = new ai(paramString, paramn, 0L))
      {
        ((SightPlayImageView)localObject).setImageDrawable(paramObject);
        paramObject.invalidateSelf();
        AppMethodBeat.o(36175);
        break;
      }
    }
  }

  private void a(Object paramObject, String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, g.a parama)
  {
    AppMethodBeat.i(36189);
    if (paramObject == null)
    {
      AppMethodBeat.o(36189);
      return;
    }
    int i = paramObject.hashCode();
    this.qIb.remove(new g.c(null, i, 0, false));
    g.c localc = new g.c(paramString, i, paramInt2, paramBoolean);
    this.qIb.add(localc);
    Object localObject1 = (LinkedList)this.qHX.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new LinkedList();
      this.qHX.put(paramString, localObject2);
    }
    ((LinkedList)localObject2).add(new WeakReference(localc));
    localObject1 = (String)((View)paramObject).getTag(2130706432);
    if (localObject1 != null)
    {
      localObject2 = (LinkedList)this.qHX.get(localObject1);
      if (localObject2 != null)
      {
        paramInt2 = 0;
        label173: if (paramInt2 >= ((LinkedList)localObject2).size())
          break label494;
        localc = (g.c)((WeakReference)((LinkedList)localObject2).get(paramInt2)).get();
        if ((localc == null) || (localc.code != i))
          break label345;
      }
    }
    while (true)
    {
      if (paramInt2 != -1)
      {
        ab.v("MicroMsg.LazyerImageLoader2", "updateImageViewToKey remove last pair %s", new Object[] { localObject1 });
        ((LinkedList)localObject2).remove(paramInt2);
      }
      ((View)paramObject).setTag(2130706432, paramString);
      localObject2 = new WeakReference(paramObject);
      this.fEk.put(Integer.valueOf(i), localObject2);
      if (paramInt1 != -1)
      {
        if (!(paramObject instanceof QFadeImageView))
          break label351;
        ((QFadeImageView)paramObject).setImageResource(paramInt1);
      }
      while (true)
        if ((parama == g.a.qIG) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
        {
          com.tencent.mm.sdk.platformtools.n.ci((View)paramObject);
          AppMethodBeat.o(36189);
          break;
          label345: paramInt2++;
          break label173;
          label351: if ((paramObject instanceof ImageView))
          {
            ((ImageView)paramObject).setImageDrawable(com.tencent.mm.bz.a.g(((ImageView)paramObject).getContext(), paramInt1));
          }
          else
          {
            localObject2 = (com.tencent.mm.plugin.sight.decode.a.a)paramObject;
            if (!this.qHJ);
            for (paramBoolean = true; ; paramBoolean = false)
            {
              ((com.tencent.mm.plugin.sight.decode.a.a)localObject2).bf(null, paramBoolean);
              break;
            }
          }
        }
      if ((paramString != null) && (paramString.startsWith("3")) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
      {
        com.tencent.mm.sdk.platformtools.n.w((View)paramObject, paramInt3, paramInt4);
        ab.d("MicroMsg.LazyerImageLoader2", "try to setlayerType " + paramInt3 + " " + paramInt4);
      }
      AppMethodBeat.o(36189);
      break;
      label494: paramInt2 = -1;
    }
  }

  private boolean a(int paramInt, bau parambau, az paramaz)
  {
    AppMethodBeat.i(36193);
    boolean bool;
    if (!this.qHJ)
    {
      if ((parambau != null) && (!bo.isNullOrNil(parambau.Id)))
        af.cnA().XH(parambau.Id);
      bool = false;
      AppMethodBeat.o(36193);
    }
    while (true)
    {
      return bool;
      af.cns().execute(new g.10(this, paramInt, parambau, paramaz));
      bool = true;
      AppMethodBeat.o(36193);
    }
  }

  public static boolean a(bau parambau, az paramaz, boolean paramBoolean)
  {
    AppMethodBeat.i(36216);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      AppMethodBeat.o(36216);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      Object localObject;
      if (parambau.Id.startsWith("Locall_path"))
      {
        localObject = an.fZ(af.getAccSnsPath(), parambau.Id) + i.m(parambau);
        label83: if (com.tencent.mm.vfs.e.ct((String)localObject))
          break label163;
        localObject = af.cnA();
        if (!paramBoolean)
          break label157;
      }
      label157: for (int i = 8; ; i = 2)
      {
        ((b)localObject).a(parambau, i, null, paramaz);
        AppMethodBeat.o(36216);
        paramBoolean = false;
        break;
        localObject = an.fZ(af.getAccSnsPath(), parambau.Id) + i.d(parambau);
        break label83;
      }
      label163: paramBoolean = true;
      AppMethodBeat.o(36216);
    }
  }

  private boolean a(String paramString, com.tencent.mm.memory.n paramn)
  {
    AppMethodBeat.i(36210);
    if ((paramn != null) && (paramString != null))
      this.qHV.put(paramString, paramn);
    AppMethodBeat.o(36210);
    return true;
  }

  private boolean a(List<bau> paramList, az paramaz)
  {
    AppMethodBeat.i(36191);
    af.cns().execute(new g.7(this, paramList, paramaz));
    AppMethodBeat.o(36191);
    return true;
  }

  private boolean ac(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(36162);
    if (paramView.hashCode() == paramInt)
      AppMethodBeat.o(36162);
    while (true)
    {
      return bool;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        int j;
        do
        {
          j = i - 1;
          if (j < 0)
            break;
          i = j;
        }
        while (!ac(paramView.getChildAt(j), paramInt));
        AppMethodBeat.o(36162);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(36162);
      }
    }
  }

  private void b(bau parambau, View paramView, int paramInt, g.a parama, az paramaz)
  {
    AppMethodBeat.i(36174);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
      AppMethodBeat.o(36174);
    while (true)
    {
      return;
      paramView.setDrawingCacheEnabled(false);
      String str = i.bc(5, parambau.Id);
      a(paramView, str, -1, paramInt, parama);
      parama = XK(str);
      if (!i.b(parama))
      {
        dA(paramView);
        if (this.qIp.contains(str))
        {
          AppMethodBeat.o(36174);
        }
        else
        {
          a(5, parambau, paramaz);
          AppMethodBeat.o(36174);
        }
      }
      else
      {
        a(paramView, str, parama);
        AppMethodBeat.o(36174);
      }
    }
  }

  private static boolean cX(String paramString, int paramInt)
  {
    AppMethodBeat.i(36199);
    paramString = br.z(paramString, "SightDownloadControl");
    boolean bool;
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(36199);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramInt == 1)
      {
        if (bo.getInt((String)paramString.get(".SightDownloadControl.G3PlusAutoDownload"), 0) == 1)
        {
          AppMethodBeat.o(36199);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(36199);
          bool = false;
        }
      }
      else if (bo.getInt((String)paramString.get(".SightDownloadControl.WifiAutoDownload"), 0) == 1)
      {
        AppMethodBeat.o(36199);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(36199);
        bool = false;
      }
    }
  }

  private boolean cmW()
  {
    AppMethodBeat.i(36192);
    boolean bool;
    if (this.qIa)
    {
      ab.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
      bool = false;
      AppMethodBeat.o(36192);
    }
    while (true)
    {
      return bool;
      af.bCo().postDelayed(new g.8(this), 0L);
      bool = true;
      AppMethodBeat.o(36192);
    }
  }

  private static void dA(View paramView)
  {
    AppMethodBeat.i(36185);
    if ((paramView instanceof QImageView))
    {
      ((QImageView)paramView).setImageResource(2130838852);
      AppMethodBeat.o(36185);
    }
    while (true)
    {
      return;
      if ((paramView instanceof ImageView))
      {
        ((ImageView)paramView).setImageResource(2130838852);
        AppMethodBeat.o(36185);
      }
      else
      {
        AppMethodBeat.o(36185);
      }
    }
  }

  public static String r(bau parambau)
  {
    AppMethodBeat.i(36176);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      parambau = null;
      AppMethodBeat.o(36176);
    }
    while (true)
    {
      return parambau;
      String str = an.fZ(af.getAccSnsPath(), parambau.Id) + i.e(parambau);
      if (!com.tencent.mm.vfs.e.ct(str))
      {
        parambau = parambau.wEH;
        AppMethodBeat.o(36176);
      }
      else
      {
        AppMethodBeat.o(36176);
        parambau = str;
      }
    }
  }

  public static String s(bau parambau)
  {
    AppMethodBeat.i(36177);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      parambau = null;
      AppMethodBeat.o(36177);
    }
    while (true)
    {
      return parambau;
      String str = an.fZ(af.getAccSnsPath(), parambau.Id) + i.d(parambau);
      if (!com.tencent.mm.vfs.e.ct(str))
      {
        parambau = parambau.Url;
        AppMethodBeat.o(36177);
      }
      else
      {
        AppMethodBeat.o(36177);
        parambau = str;
      }
    }
  }

  public static boolean t(bau parambau)
  {
    boolean bool = true;
    AppMethodBeat.i(36194);
    String str1 = an.fZ(af.getAccSnsPath(), parambau.Id);
    String str2 = i.j(parambau);
    if (com.tencent.mm.vfs.e.ct(str1 + str2))
      AppMethodBeat.o(36194);
    while (true)
    {
      return bool;
      if ((com.tencent.mm.vfs.e.ct(str1 + i.p(parambau))) && (!bo.isNullOrNil(parambau.Id)) && (parambau.Id.startsWith("Locall_path")))
      {
        AppMethodBeat.o(36194);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(36194);
      }
    }
  }

  public final void A(bau parambau)
  {
    AppMethodBeat.i(36206);
    this.qIc.put(parambau.Id, Integer.valueOf(3));
    AppMethodBeat.o(36206);
  }

  public final boolean B(bau parambau)
  {
    boolean bool = true;
    AppMethodBeat.i(36215);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      bool = false;
      AppMethodBeat.o(36215);
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), parambau.Id) + i.f(parambau)))
      {
        AppMethodBeat.o(36215);
      }
      else if (com.tencent.mm.vfs.e.ct(an.fZ(af.getAccSnsPath(), parambau.Id) + i.e(parambau)))
      {
        AppMethodBeat.o(36215);
      }
      else
      {
        parambau = i.bc(1, parambau.Id);
        bool = i.b((com.tencent.mm.memory.n)this.qHV.get(parambau));
        AppMethodBeat.o(36215);
      }
    }
  }

  public final com.tencent.mm.memory.n XK(String paramString)
  {
    AppMethodBeat.i(36169);
    com.tencent.mm.memory.n localn = (com.tencent.mm.memory.n)this.qHV.get(paramString);
    if ((localn == null) || (localn.isRecycled()))
    {
      this.qHV.remove(paramString);
      paramString = null;
      AppMethodBeat.o(36169);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(36169);
      paramString = localn;
    }
  }

  public final void XM(String paramString)
  {
    AppMethodBeat.i(36212);
    b(paramString, null);
    AppMethodBeat.o(36212);
  }

  public final com.tencent.mm.memory.n XN(String paramString)
  {
    AppMethodBeat.i(36213);
    if (this.qHV == null)
    {
      paramString = null;
      AppMethodBeat.o(36213);
    }
    while (true)
    {
      return paramString;
      paramString = (com.tencent.mm.memory.n)this.qHV.get("0-".concat(String.valueOf(paramString)));
      AppMethodBeat.o(36213);
    }
  }

  public final int a(com.tencent.mm.plugin.sns.storage.n paramn, int[] paramArrayOfInt)
  {
    int i = 5;
    AppMethodBeat.i(36196);
    Object localObject;
    if ((paramArrayOfInt != null) || (bo.az(this.qIf) > 60000L))
    {
      PInt localPInt1 = new PInt();
      localObject = new PInt();
      PInt localPInt2 = new PInt();
      c.afC();
      if (c.a(localPInt1, (PInt)localObject, localPInt2))
      {
        this.qIh = 5;
        if (paramArrayOfInt != null)
        {
          if (localPInt1.value != 0)
            break label161;
          j = 0;
          label89: paramArrayOfInt[0] = j;
          paramArrayOfInt[1] = ((PInt)localObject).value;
          paramArrayOfInt[2] = localPInt2.value;
        }
        this.qIi = localPInt1.value;
        this.qIf = bo.yz();
      }
    }
    else
    {
      if ((this.qIi != 0) && (paramn != null))
        break label167;
      j = this.qIh;
      AppMethodBeat.o(36196);
    }
    while (true)
    {
      return j;
      this.qIh = 10;
      break;
      label161: j = 1;
      break label89;
      label167: if (this.qIj.containsKey(Long.valueOf(paramn.field_snsId)))
      {
        j = ((Integer)this.qIj.get(Long.valueOf(paramn.field_snsId))).intValue();
        AppMethodBeat.o(36196);
      }
      else
      {
        paramArrayOfInt = new cbn();
        try
        {
          localObject = new com/tencent/mm/protocal/protobuf/cbf;
          ((cbf)localObject).<init>();
          localObject = (cbf)((cbf)localObject).parseFrom(paramn.field_attrBuf);
          if (((cbf)localObject).xaD == null)
          {
            j = this.qIh;
            AppMethodBeat.o(36196);
          }
          else
          {
            paramArrayOfInt.parseFrom(((cbf)localObject).xaD.getBufferToBytes());
            if ((paramArrayOfInt.xaS != null) && (paramArrayOfInt.xaS.info != null))
              break label344;
            j = this.qIh;
            AppMethodBeat.o(36196);
          }
        }
        catch (Exception paramn)
        {
          ab.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramn, "", new Object[0]);
          j = this.qIh;
          AppMethodBeat.o(36196);
        }
      }
    }
    label344: paramArrayOfInt = paramArrayOfInt.xaS.info;
    int j = paramArrayOfInt.hashCode();
    if (this.qIi == 1)
    {
      if (!this.qIl.containsKey(Integer.valueOf(j)))
        this.qIl.put(Integer.valueOf(j), Boolean.valueOf(cX(paramArrayOfInt, this.qIi)));
      if (((Boolean)this.qIl.get(Integer.valueOf(j))).booleanValue());
      for (j = 5; ; j = 10)
      {
        ab.i("MicroMsg.LazyerImageLoader2", "isAutoDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramn.field_snsId), Integer.valueOf(j) });
        this.qIj.put(Long.valueOf(paramn.field_snsId), Integer.valueOf(j));
        AppMethodBeat.o(36196);
        break;
      }
    }
    if (!this.qIk.containsKey(Integer.valueOf(j)))
      this.qIk.put(Integer.valueOf(j), Boolean.valueOf(cX(paramArrayOfInt, this.qIi)));
    if (((Boolean)this.qIk.get(Integer.valueOf(j))).booleanValue());
    for (j = i; ; j = 10)
      break;
  }

  public final Bitmap a(bau parambau, View paramView, int paramInt, az paramaz, boolean paramBoolean)
  {
    AppMethodBeat.i(36161);
    parambau = a(parambau, paramView, paramInt, true, paramaz, paramBoolean);
    AppMethodBeat.o(36161);
    return parambau;
  }

  public final Bitmap a(bau parambau, View paramView, int paramInt, boolean paramBoolean1, az paramaz, boolean paramBoolean2)
  {
    AppMethodBeat.i(36218);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      parambau = null;
      AppMethodBeat.o(36218);
    }
    while (true)
    {
      return parambau;
      String str = i.bc(3, parambau.Id);
      Object localObject1 = C(parambau);
      int i = -1;
      int j = -1;
      int k = i;
      try
      {
        Object localObject2 = d.amj((String)localObject1);
        k = i;
        i = ((BitmapFactory.Options)localObject2).outWidth;
        k = i;
        int m = ((BitmapFactory.Options)localObject2).outHeight;
        j = m;
        k = i;
        label103: a(paramView, str, false, -1, paramInt, k, j, g.a.qIF);
        if (af.cnA().XE(parambau.Id))
        {
          parambau = null;
          AppMethodBeat.o(36218);
          continue;
        }
        localObject2 = this.qHW;
        paramView = (al.b)((al)localObject2).qMs.get(str);
        label172: boolean bool;
        if (paramView == null)
        {
          paramView = null;
          paramView = (WeakReference)paramView;
          localObject2 = new StringBuilder("getFromWeakReference ").append(str).append("  ");
          if (paramView != null)
            break label272;
          bool = true;
          label207: ab.i("MicroMsg.LazyerImageLoader2", bool);
          if (paramView != null)
            break label278;
        }
        label272: label278: for (paramView = null; ; paramView = (Bitmap)paramView.get())
        {
          if (!i.B(paramView))
            break label289;
          AppMethodBeat.o(36218);
          parambau = paramView;
          break;
          ((al.b)((al)localObject2).qMs.get(str)).cob();
          paramView = paramView.obj;
          break label172;
          bool = false;
          break label207;
        }
        label289: if (parambau.Id.startsWith("pre_temp_extend_pic"))
        {
          paramView = s.Zk((String)localObject1);
          label308: localObject1 = this.qHW;
          localObject2 = new WeakReference(paramView);
          if ((al.b)((al)localObject1).qMs.get(str) != null)
            break label402;
          localObject2 = new al.b((al)localObject1, localObject2);
          ((al)localObject1).qMs.put(str, localObject2);
          ((al)localObject1).coa();
        }
        while (true)
        {
          if (!i.B(paramView))
            break label443;
          AppMethodBeat.o(36218);
          parambau = paramView;
          break;
          paramView = i.Xj((String)localObject1);
          break label308;
          label402: ((al.b)((al)localObject1).qMs.get(str)).cob();
          ((al.b)((al)localObject1).qMs.get(str)).obj = localObject2;
        }
        label443: if (paramBoolean1)
        {
          paramView = af.cnA();
          if (!paramBoolean2)
            break label481;
        }
        label481: for (paramInt = 8; ; paramInt = 2)
        {
          paramView.a(parambau, paramInt, null, paramaz);
          parambau = null;
          AppMethodBeat.o(36218);
          break;
        }
      }
      catch (Exception localException)
      {
        break label103;
      }
    }
  }

  public final com.tencent.mm.memory.n a(bau parambau, ImageView paramImageView, int paramInt, az paramaz)
  {
    Object localObject = null;
    AppMethodBeat.i(36219);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      AppMethodBeat.o(36219);
      parambau = localObject;
    }
    while (true)
    {
      return parambau;
      paramImageView.setDrawingCacheEnabled(false);
      String str = i.bc(0, parambau.Id);
      a(paramImageView, str, -1, paramInt);
      paramImageView = XK(str);
      if (!i.b(paramImageView))
      {
        a(0, parambau, paramaz);
        AppMethodBeat.o(36219);
        parambau = localObject;
      }
      else
      {
        AppMethodBeat.o(36219);
        parambau = paramImageView;
      }
    }
  }

  public final String a(bau parambau)
  {
    AppMethodBeat.i(36166);
    String str = an.fZ(af.getAccSnsPath(), parambau.Id);
    parambau = i.e(parambau);
    parambau = str + parambau;
    AppMethodBeat.o(36166);
    return parambau;
  }

  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(36220);
    a(paramView, null, true, -1, paramInt3, -1, -1, g.a.qIF);
    if (paramInt1 != -1)
      paramView.setBackgroundResource(paramInt1);
    if (paramInt2 != -1)
      if ((paramView instanceof QFadeImageView))
      {
        ((QFadeImageView)paramView).setImageResource(paramInt2);
        AppMethodBeat.o(36220);
      }
    while (true)
    {
      return;
      if ((paramView instanceof ImageView))
      {
        ((ImageView)paramView).setImageDrawable(com.tencent.mm.bz.a.g(paramView.getContext(), paramInt2));
        AppMethodBeat.o(36220);
        continue;
        if ((paramView instanceof QFadeImageView))
        {
          ((QFadeImageView)paramView).setImageResource(2130838852);
          AppMethodBeat.o(36220);
        }
        else if ((paramView instanceof ImageView))
        {
          ((ImageView)paramView).setImageResource(2130838852);
        }
      }
      else
      {
        AppMethodBeat.o(36220);
      }
    }
  }

  public final void a(bau parambau, View paramView, int paramInt1, int paramInt2, g.a parama, az paramaz)
  {
    AppMethodBeat.i(36173);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
      AppMethodBeat.o(36173);
    while (true)
    {
      return;
      paramView.setDrawingCacheEnabled(false);
      String str = i.bc(0, parambau.Id);
      a(paramView, str, paramInt1, paramInt2, parama);
      parama = XK(str);
      if (!i.b(parama))
      {
        ab.d("MicroMsg.LazyerImageLoader2", "setSnsGrid cache miss");
        if (paramInt1 == -1)
          dA(paramView);
        if (this.qIp.contains(str))
        {
          AppMethodBeat.o(36173);
        }
        else
        {
          a(0, parambau, paramaz);
          AppMethodBeat.o(36173);
        }
      }
      else
      {
        ab.d("MicroMsg.LazyerImageLoader2", "setSnsGrid cache hit");
        af.cnA().XH(parambau.Id);
        a(paramView, str, parama);
        AppMethodBeat.o(36173);
      }
    }
  }

  public final void a(bau parambau, View paramView, int paramInt1, int paramInt2, az paramaz)
  {
    AppMethodBeat.i(36171);
    a(parambau, paramView, paramInt1, paramInt2, g.a.qIF, paramaz);
    AppMethodBeat.o(36171);
  }

  public final void a(bau parambau, View paramView, int paramInt, g.a parama, az paramaz)
  {
    AppMethodBeat.i(36168);
    a(parambau, paramView, -1, paramInt, parama, paramaz);
    AppMethodBeat.o(36168);
  }

  public final void a(bau parambau, View paramView, int paramInt, az paramaz)
  {
    AppMethodBeat.i(36178);
    b(parambau, paramView, -1, paramInt, paramaz);
    AppMethodBeat.o(36178);
  }

  public final void a(String paramString, SparseArray<bau> paramSparseArray, SparseArray<View> paramSparseArray1, int paramInt, az paramaz)
  {
    AppMethodBeat.i(36172);
    ab.i("MicroMsg.LazyerImageLoader2", "enter group img download logic!");
    if ((paramSparseArray == null) || (paramSparseArray.size() <= 0))
    {
      ab.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, medias is invalid.");
      AppMethodBeat.o(36172);
    }
    while (true)
    {
      return;
      if ((paramSparseArray1 == null) || (paramSparseArray1.size() <= 0))
      {
        ab.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, imageViews is invalid.");
        AppMethodBeat.o(36172);
      }
      else
      {
        int i = paramSparseArray.size();
        int j = paramSparseArray1.size();
        if (i == j);
        for (int k = i; ; k = -1)
        {
          if (-1 != k)
            break label140;
          ab.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, mediaSize(%d) != imgViewSize(%d).", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          AppMethodBeat.o(36172);
          break;
        }
        label140: SparseArray localSparseArray1 = new SparseArray();
        SparseArray localSparseArray2 = new SparseArray();
        SparseArray localSparseArray3 = new SparseArray();
        k = 0;
        if (k < i)
        {
          j = paramSparseArray.keyAt(k);
          bau localbau = (bau)paramSparseArray.get(j);
          View localView = (View)paramSparseArray1.get(j);
          localView.setDrawingCacheEnabled(false);
          String str = i.bc(0, localbau.Id);
          a(localView, str, -1, paramInt, g.a.qIF);
          com.tencent.mm.memory.n localn = XK(str);
          if (!i.b(localn))
          {
            ab.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache miss.");
            dA(localView);
            if (this.qIp.contains(str))
              AppMethodBeat.o(36172);
            else
              localSparseArray1.put(j, localbau);
          }
          else
          {
            while (true)
            {
              k++;
              break;
              ab.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache hit.");
              a(localView, str, localn);
            }
          }
        }
        else
        {
          af.cns().execute(new g.6(this, localSparseArray1, localSparseArray2, localSparseArray3, paramString, paramaz));
          AppMethodBeat.o(36172);
        }
      }
    }
  }

  public final void a(List<bau> paramList, View paramView, int paramInt, g.a parama, az paramaz)
  {
    AppMethodBeat.i(36221);
    a(paramList, paramView, paramInt, parama, paramaz, false);
    AppMethodBeat.o(36221);
  }

  public final void a(List<bau> paramList, View paramView, int paramInt, g.a parama, az paramaz, boolean paramBoolean)
  {
    AppMethodBeat.i(36222);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(36222);
    while (true)
    {
      return;
      if (paramList.size() == 1)
      {
        if (!paramBoolean)
        {
          b((bau)paramList.get(0), paramView, paramInt, paramaz);
          AppMethodBeat.o(36222);
        }
        else
        {
          b((bau)paramList.get(0), paramView, paramInt, g.a.qIG, paramaz);
          AppMethodBeat.o(36222);
        }
      }
      else
      {
        String str = i.bc(0, i.dc(paramList));
        a(paramView, str, paramInt, parama);
        parama = XK(str);
        paramBoolean = i.b(parama);
        ab.v("MicroMsg.LazyerImageLoader2", "set Sns GridList ".concat(String.valueOf(paramBoolean)));
        if (!paramBoolean)
        {
          dA(paramView);
          if (this.qIp.contains(str))
          {
            AppMethodBeat.o(36222);
          }
          else
          {
            new WeakReference(paramView);
            a(paramList, paramaz);
            AppMethodBeat.o(36222);
          }
        }
        else
        {
          a(paramView, str, parama);
          AppMethodBeat.o(36222);
        }
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.sight.decode.a.a parama, int paramInt)
  {
    AppMethodBeat.i(36179);
    a(parama, "", -1, paramInt);
    parama.setThumbBmp(null);
    parama.bf(null, false);
    AppMethodBeat.o(36179);
    return true;
  }

  public final boolean a(com.tencent.mm.plugin.sns.data.e parame, String paramString)
  {
    AppMethodBeat.i(36211);
    Object localObject1 = (bau)parame.list.get(0);
    int i = 1;
    Object localObject2;
    if (i < parame.list.size())
    {
      localObject2 = (bau)parame.list.get(i);
      if ((paramString == null) || (paramString.indexOf(((bau)localObject2).Id) < 0));
    }
    while (true)
    {
      localObject1 = an.fZ(af.getAccSnsPath(), ((bau)localObject2).Id);
      if (parame.qFQ == 0)
        paramString = i.f((bau)localObject2);
      while (true)
      {
        String str = i.bc(parame.qFQ, ((bau)localObject2).Id);
        if (!this.qHV.aj(str))
          new g.b(this, i.bc(parame.qFQ, ((bau)localObject2).Id), (String)localObject1 + paramString, (String)localObject1, (bau)localObject2, parame.qFQ).u(new String[] { "" });
        AppMethodBeat.o(36211);
        return true;
        i++;
        break;
        if (parame.qFQ == 4)
          paramString = i.g((bau)localObject2);
        else if (parame.qFQ == 5)
          paramString = i.g((bau)localObject2);
        else if (parame.qFQ == 3)
          paramString = i.l((bau)localObject2);
        else
          paramString = i.e((bau)localObject2);
      }
      localObject2 = localObject1;
    }
  }

  public final boolean a(com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, com.tencent.mm.plugin.sight.decode.a.a parama, int paramInt1, int paramInt2, az paramaz, boolean paramBoolean)
  {
    AppMethodBeat.i(36180);
    paramBoolean = a(paramn, parambau, parama, paramInt1, paramInt2, paramaz, paramBoolean, false);
    AppMethodBeat.o(36180);
    return paramBoolean;
  }

  public final boolean a(com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, com.tencent.mm.plugin.sight.decode.a.a parama, int paramInt1, int paramInt2, az paramaz, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(36181);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      paramBoolean1 = false;
      AppMethodBeat.o(36181);
    }
    while (true)
    {
      return paramBoolean1;
      String str1 = i.bc(1, parambau.Id);
      a(parama, str1, -1, paramInt1);
      String str2 = an.fZ(af.getAccSnsPath(), parambau.Id);
      String str3 = i.e(parambau);
      Object localObject;
      if (!com.tencent.mm.vfs.e.ct(str2 + str3))
      {
        localObject = new com.tencent.mm.plugin.sns.data.e(parambau);
        ((com.tencent.mm.plugin.sns.data.e)localObject).qFQ = 1;
        ((com.tencent.mm.plugin.sns.data.e)localObject).nQB = parambau.Id;
        b localb = af.cnA();
        if (parambau.jCt == 6)
        {
          paramInt1 = 5;
          label148: localb.a(parambau, paramInt1, (com.tencent.mm.plugin.sns.data.e)localObject, paramaz);
        }
      }
      else
      {
        localObject = "";
        if (paramBoolean1)
          localObject = a(paramn, parambau, paramaz, paramBoolean1);
        ab.i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", new Object[] { str1, localObject, Boolean.valueOf(paramBoolean1) });
        if ((bo.isNullOrNil((String)localObject)) || (u(parambau)))
          break label336;
        if (!((String)localObject).equals(parama.getVideoPath()))
        {
          if (!paramBoolean2)
            break label325;
          paramn = BitmapFactory.decodeFile(str2 + str3);
          label272: parama.setThumbBmp(paramn);
        }
        if (this.qHJ)
          break label330;
      }
      label325: label330: for (paramBoolean1 = true; ; paramBoolean1 = false)
      {
        parama.bf((String)localObject, paramBoolean1);
        parama.setPosition(paramInt2);
        paramBoolean1 = true;
        AppMethodBeat.o(36181);
        break;
        paramInt1 = 1;
        break label148;
        paramn = null;
        break label272;
      }
      label336: ab.i("MicroMsg.LazyerImageLoader2", "sightPath %s", new Object[] { localObject });
      if (!this.qHJ)
      {
        paramBoolean1 = true;
        label363: parama.bf(null, paramBoolean1);
        paramn = XK(str1);
        paramBoolean1 = i.b(paramn);
        ab.v("MicroMsg.LazyerImageLoader2", "setsight thumb  %s", new Object[] { Boolean.valueOf(paramBoolean1) });
        if (paramBoolean1)
          break label533;
        if ((!(parama instanceof ImageView)) && (!(parama instanceof QFadeImageView)))
          break label463;
        dA((View)parama);
      }
      while (true)
        if (this.qIp.contains(str1))
        {
          paramBoolean1 = false;
          AppMethodBeat.o(36181);
          break;
          paramBoolean1 = false;
          break label363;
          label463: if ((parama instanceof com.tencent.mm.plugin.sight.decode.a.a))
          {
            if (!this.qHJ);
            for (paramBoolean1 = true; ; paramBoolean1 = false)
            {
              parama.bf(null, paramBoolean1);
              parama.setPosition(0);
              parama.setThumbBmp(null);
              break;
            }
          }
        }
      a(1, parambau, paramaz);
      paramBoolean1 = false;
      AppMethodBeat.o(36181);
      continue;
      label533: a(parama, str1, paramn);
      paramBoolean1 = true;
      AppMethodBeat.o(36181);
    }
  }

  public final boolean a(bau parambau, View paramView, int paramInt1, int paramInt2, az paramaz, int paramInt3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(36184);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      AppMethodBeat.o(36184);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      String str = i.bc(paramInt3, parambau.Id);
      a(paramView, str, paramInt1, paramInt2);
      com.tencent.mm.memory.n localn = XK(str);
      boolean bool2 = i.b(localn);
      ab.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + bool2 + " " + str);
      if (!bool2)
      {
        if (paramInt1 == -1)
          dA(paramView);
        if (this.qIp.contains(str))
        {
          AppMethodBeat.o(36184);
        }
        else
        {
          a(paramInt3, parambau, paramaz);
          AppMethodBeat.o(36184);
          bool1 = false;
        }
      }
      else
      {
        a(paramView, str, localn);
        AppMethodBeat.o(36184);
      }
    }
  }

  public final boolean a(String paramString, com.tencent.mm.memory.n paramn, int paramInt)
  {
    AppMethodBeat.i(36209);
    a(paramInt + "-" + paramString, paramn);
    AppMethodBeat.o(36209);
    return true;
  }

  public final void ab(Activity paramActivity)
  {
    AppMethodBeat.i(36163);
    ab.d("MicroMsg.LazyerImageLoader2", "try to remove ImageView " + this.fEk.size());
    Object localObject1 = new LinkedList();
    Object localObject2 = this.qIb.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (g.c)((Iterator)localObject2).next();
      if (ac(paramActivity.getWindow().getDecorView(), ((g.c)localObject3).code))
        ((List)localObject1).add(Integer.valueOf(((g.c)localObject3).code));
    }
    localObject2 = ((List)localObject1).iterator();
    int i;
    while (true)
    {
      if (!((Iterator)localObject2).hasNext())
        break label208;
      i = ((Integer)((Iterator)localObject2).next()).intValue();
      this.fEk.remove(Integer.valueOf(i));
      Iterator localIterator = this.qIb.iterator();
      if (localIterator.hasNext())
      {
        localObject3 = (g.c)localIterator.next();
        if (((g.c)localObject3).code != i)
          break;
        this.qIb.remove(localObject3);
      }
    }
    label208: ((List)localObject1).clear();
    Object localObject3 = this.qIb.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (g.c)((Iterator)localObject3).next();
      if (((g.c)localObject2).qIJ == paramActivity.hashCode())
        ((List)localObject1).add(Integer.valueOf(((g.c)localObject2).code));
    }
    paramActivity = ((List)localObject1).iterator();
    while (true)
    {
      if (!paramActivity.hasNext())
        break label365;
      i = ((Integer)paramActivity.next()).intValue();
      this.fEk.remove(Integer.valueOf(i));
      localObject2 = this.qIb.iterator();
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (g.c)((Iterator)localObject2).next();
        if (((g.c)localObject1).code != i)
          break;
        this.qIb.remove(localObject1);
      }
    }
    label365: this.qHW.coa();
    ab.d("MicroMsg.LazyerImageLoader2", "after try to remove ImageView " + this.fEk.size());
    AppMethodBeat.o(36163);
  }

  public final int b(com.tencent.mm.plugin.sns.storage.n paramn, int[] paramArrayOfInt)
  {
    int i = 5;
    AppMethodBeat.i(36198);
    Object localObject;
    if ((paramArrayOfInt != null) || (bo.az(this.qIg) > 60000L))
    {
      localObject = new PInt();
      PInt localPInt = new PInt();
      c.afC();
      if (c.a((PInt)localObject, localPInt))
      {
        this.qIm = 5;
        if (paramArrayOfInt != null)
        {
          if (((PInt)localObject).value != 0)
            break label142;
          j = 0;
          label78: paramArrayOfInt[0] = j;
          paramArrayOfInt[1] = localPInt.value;
        }
        this.qIn = ((PInt)localObject).value;
        this.qIg = bo.yz();
      }
    }
    else
    {
      if ((this.qIn != 0) && (paramn != null))
        break label148;
      j = this.qIm;
      AppMethodBeat.o(36198);
    }
    while (true)
    {
      return j;
      this.qIm = 10;
      break;
      label142: j = 1;
      break label78;
      label148: if (this.qIo.containsKey(Long.valueOf(paramn.field_snsId)))
      {
        j = ((Integer)this.qIo.get(Long.valueOf(paramn.field_snsId))).intValue();
        AppMethodBeat.o(36198);
      }
      else
      {
        paramArrayOfInt = new cbn();
        try
        {
          localObject = new com/tencent/mm/protocal/protobuf/cbf;
          ((cbf)localObject).<init>();
          localObject = (cbf)((cbf)localObject).parseFrom(paramn.field_attrBuf);
          if (((cbf)localObject).xaD == null)
          {
            j = this.qIm;
            AppMethodBeat.o(36198);
          }
          else
          {
            paramArrayOfInt.parseFrom(((cbf)localObject).xaD.getBufferToBytes());
            if ((paramArrayOfInt.xaS != null) && (paramArrayOfInt.xaS.info != null))
              break label325;
            j = this.qIh;
            AppMethodBeat.o(36198);
          }
        }
        catch (Exception paramn)
        {
          ab.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramn, "", new Object[0]);
          j = this.qIm;
          AppMethodBeat.o(36198);
        }
      }
    }
    label325: paramArrayOfInt = paramArrayOfInt.xaS.info;
    int j = paramArrayOfInt.hashCode();
    if (this.qIn == 1)
    {
      if (!this.qIl.containsKey(Integer.valueOf(j)))
        this.qIl.put(Integer.valueOf(j), Boolean.valueOf(cX(paramArrayOfInt, this.qIn)));
      if (((Boolean)this.qIl.get(Integer.valueOf(j))).booleanValue());
      for (j = 5; ; j = 10)
      {
        ab.i("MicroMsg.LazyerImageLoader2", "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramn.field_snsId), Integer.valueOf(j) });
        this.qIo.put(Long.valueOf(paramn.field_snsId), Integer.valueOf(j));
        AppMethodBeat.o(36198);
        break;
      }
    }
    if (!this.qIk.containsKey(Integer.valueOf(j)))
      this.qIk.put(Integer.valueOf(j), Boolean.valueOf(cX(paramArrayOfInt, this.qIn)));
    if (((Boolean)this.qIk.get(Integer.valueOf(j))).booleanValue());
    for (j = i; ; j = 10)
      break;
  }

  public final Bitmap b(bau parambau)
  {
    AppMethodBeat.i(36165);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
    {
      AppMethodBeat.o(36165);
      parambau = null;
    }
    while (true)
    {
      return parambau;
      String str1 = i.bc(1, parambau.Id);
      Object localObject = XK(str1);
      if (i.b((com.tencent.mm.memory.n)localObject))
      {
        parambau = ((com.tencent.mm.memory.n)localObject).Xh();
        AppMethodBeat.o(36165);
      }
      else
      {
        String str2 = an.fZ(af.getAccSnsPath(), parambau.Id);
        localObject = i.e(parambau);
        localObject = str2 + (String)localObject;
        if (com.tencent.mm.vfs.e.ct((String)localObject))
        {
          if (parambau.Id.startsWith("pre_temp_extend_pic"));
          for (parambau = com.tencent.mm.memory.n.w(s.Zk((String)localObject)); ; parambau = i.Xk((String)localObject))
          {
            if (!i.b(parambau))
              break label177;
            a(str1, parambau);
            parambau = parambau.Xh();
            AppMethodBeat.o(36165);
            break;
          }
          label177: AppMethodBeat.o(36165);
          parambau = null;
        }
        else
        {
          AppMethodBeat.o(36165);
          parambau = null;
        }
      }
    }
  }

  public final void b(bau parambau, View paramView, int paramInt, az paramaz)
  {
    AppMethodBeat.i(36167);
    a(parambau, paramView, -1, paramInt, paramaz);
    AppMethodBeat.o(36167);
  }

  protected final void b(String paramString, com.tencent.mm.memory.n paramn)
  {
    AppMethodBeat.i(36223);
    com.tencent.mm.memory.n localn = paramn;
    if (!i.b(paramn))
      localn = XL(paramString);
    if (i.b(localn))
    {
      if ((this.qHV != null) && (localn != null) && (paramString != null))
        this.qHV.put(paramString, localn);
      paramn = (LinkedList)this.qHX.get(paramString);
      if (paramn != null)
      {
        paramn = paramn.iterator();
        while (paramn.hasNext())
        {
          Object localObject = (g.c)((WeakReference)paramn.next()).get();
          if ((localObject != null) && (((g.c)localObject).qIK) && (paramString != null) && (paramString.equals(((g.c)localObject).id)))
          {
            int i = ((g.c)localObject).code;
            localObject = (WeakReference)this.fEk.get(Integer.valueOf(i));
            if (localObject != null)
            {
              localObject = ((WeakReference)localObject).get();
              if (localObject != null)
                if ((localObject instanceof QFadeImageView))
                {
                  QFadeImageView localQFadeImageView = (QFadeImageView)localObject;
                  if ((this.qIe != null) && ((localQFadeImageView instanceof TagImageView)))
                  {
                    i = ((TagImageView)localQFadeImageView).getPosition();
                    if ((i != -1) && (!this.qIe.DQ(i)))
                      continue;
                  }
                }
                else if ((i.b(localn)) && (localObject != null))
                {
                  a(localObject, paramString, localn);
                }
                else
                {
                  boolean bool1;
                  if (localn == null)
                  {
                    bool1 = true;
                    label263: if (localObject != null)
                      break label318;
                  }
                  label318: for (boolean bool2 = true; ; bool2 = false)
                  {
                    ab.d("MicroMsg.LazyerImageLoader2", "setRefImageView null bmNUll: %s ivNull: %s bimapavailable %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(i.b(localn)) });
                    break;
                    bool1 = false;
                    break label263;
                  }
                }
            }
          }
        }
      }
    }
    AppMethodBeat.o(36223);
  }

  public final boolean b(bau parambau, View paramView, int paramInt1, int paramInt2, az paramaz)
  {
    AppMethodBeat.i(36183);
    boolean bool = a(parambau, paramView, paramInt1, paramInt2, paramaz, 1);
    AppMethodBeat.o(36183);
    return bool;
  }

  public final void c(bau parambau, View paramView, int paramInt, az paramaz)
  {
    AppMethodBeat.i(36182);
    if ((parambau == null) || (parambau.Id == null) || (parambau.Id.equals("")))
      AppMethodBeat.o(36182);
    while (true)
    {
      return;
      String str = i.bc(4, parambau.Id);
      a(paramView, str, -1, paramInt);
      com.tencent.mm.memory.n localn = XK(str);
      boolean bool = i.b(localn);
      ab.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  ".concat(String.valueOf(bool)));
      if (!bool)
      {
        dA(paramView);
        if (!this.qIp.contains(str))
        {
          a(4, parambau, paramaz);
          AppMethodBeat.o(36182);
        }
      }
      else
      {
        a(paramView, str, localn);
        AppMethodBeat.o(36182);
      }
    }
  }

  public final void cmV()
  {
    AppMethodBeat.i(36160);
    if (this.qHV != null)
    {
      this.fEk.clear();
      this.qHW.qMs.clear();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("mMemoryCache \n");
      localStringBuffer.append("putCount:" + this.qHV.putCount() + ";");
      localStringBuffer.append("missCount:" + this.qHV.missCount() + ";");
      localStringBuffer.append("hitCount:" + this.qHV.hitCount() + ";");
      localStringBuffer.append("createCount:" + this.qHV.createCount() + ";");
      localStringBuffer.append("evictionCount:" + this.qHV.evictionCount() + ";");
      ab.i("MicroMsg.LazyerImageLoader2", "report lurcache ");
      this.qHV.trimToSize(-1);
    }
    this.qHW.coa();
    System.gc();
    AppMethodBeat.o(36160);
  }

  public final void cmm()
  {
    AppMethodBeat.i(36224);
    cmV();
    this.qIf = 0L;
    this.qIg = 0L;
    this.qHZ.clear();
    this.qIa = false;
    AppMethodBeat.o(36224);
  }

  public final boolean dB(View paramView)
  {
    AppMethodBeat.i(36190);
    int i = paramView.hashCode();
    Iterator localIterator = this.qIb.iterator();
    while (localIterator.hasNext())
    {
      paramView = (g.c)localIterator.next();
      if (i == paramView.code)
        this.qIb.remove(paramView);
    }
    this.fEk.remove(Integer.valueOf(i));
    AppMethodBeat.o(36190);
    return true;
  }

  public final void dz(View paramView)
  {
    AppMethodBeat.i(36164);
    if ((paramView instanceof ImageView))
    {
      ((ImageView)paramView).setImageBitmap(null);
      AppMethodBeat.o(36164);
    }
    while (true)
    {
      return;
      if ((paramView instanceof QImageView))
      {
        ((QImageView)paramView).setImageBitmap(null);
        AppMethodBeat.o(36164);
      }
      else
      {
        AppMethodBeat.o(36164);
      }
    }
  }

  public final boolean fX(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(36208);
    if ((this.qIc.containsKey(paramString1)) && (3 == ((Integer)this.qIc.get(paramString1)).intValue()))
      this.qIc.remove(paramString1);
    String str = i.bc(1, paramString1);
    Object localObject1 = (LinkedList)this.qHX.get(str);
    if (localObject1 == null)
      AppMethodBeat.o(36208);
    while (true)
    {
      return bool;
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (g.c)((WeakReference)((Iterator)localObject1).next()).get();
        if ((localObject2 != null) && (((g.c)localObject2).qIK) && (str != null) && (str.equals(((g.c)localObject2).id)))
        {
          int i = ((g.c)localObject2).code;
          localObject2 = (WeakReference)this.fEk.get(Integer.valueOf(i));
          if (localObject2 != null)
          {
            localObject2 = ((WeakReference)localObject2).get();
            if ((localObject2 != null) && ((localObject2 instanceof com.tencent.mm.plugin.sight.decode.a.a)))
            {
              ab.i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", new Object[] { paramString1, paramString2 });
              localObject2 = (com.tencent.mm.plugin.sight.decode.a.a)localObject2;
              if ((((com.tencent.mm.plugin.sight.decode.a.a)localObject2).getTagObject() instanceof aj))
              {
                aj localaj = (aj)((com.tencent.mm.plugin.sight.decode.a.a)localObject2).getTagObject();
                if (localaj != null)
                {
                  if (com.tencent.mm.vfs.e.ct(paramString2))
                  {
                    if (!this.qHJ);
                    for (bool = true; ; bool = false)
                    {
                      ((com.tencent.mm.plugin.sight.decode.a.a)localObject2).bf(paramString2, bool);
                      ((com.tencent.mm.plugin.sight.decode.a.a)localObject2).setPosition(localaj.position);
                      localaj.rnu.setVisibility(8);
                      localaj.raP.setVisibility(8);
                      localaj.raQ.setVisibility(8);
                      if ((!this.qIc.containsKey(paramString1)) || (4 != ((Integer)this.qIc.get(paramString1)).intValue()))
                        break;
                      this.qIc.remove(paramString1);
                      break;
                    }
                  }
                  this.qIc.put(paramString1, Integer.valueOf(4));
                  localaj.rnu.setVisibility(8);
                  localaj.raP.setImageResource(2130840197);
                  localaj.raP.setVisibility(0);
                }
                else
                {
                  if (!this.qHJ);
                  for (bool = true; ; bool = false)
                  {
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject2).bf(paramString2, bool);
                    break;
                  }
                }
              }
            }
          }
        }
      }
      AppMethodBeat.o(36208);
      bool = true;
    }
  }

  public final int n(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    AppMethodBeat.i(36195);
    int i = a(paramn, null);
    AppMethodBeat.o(36195);
    return i;
  }

  public final int o(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    AppMethodBeat.i(138378);
    int i = b(paramn, null);
    AppMethodBeat.o(138378);
    return i;
  }

  public final void pause()
  {
    AppMethodBeat.i(36158);
    this.qHJ = false;
    b localb = af.cnA();
    localb.qHJ = false;
    com.tencent.mm.plugin.sns.data.f localf;
    synchronized (localb.eHH)
    {
      localObject2 = new java/util/LinkedList;
      ((LinkedList)localObject2).<init>();
      Iterator localIterator = localb.eow.iterator();
      while (localIterator.hasNext())
      {
        localf = (com.tencent.mm.plugin.sns.data.f)localIterator.next();
        if (localf.requestType != 6)
        {
          localb.qHM.remove(localf.key);
          ((LinkedList)localObject2).add(localf);
        }
      }
    }
    Object localObject2 = ((LinkedList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localf = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject2).next();
      localObject1.eow.remove(localf);
    }
    AppMethodBeat.o(36158);
  }

  public final void start()
  {
    AppMethodBeat.i(36157);
    this.qHJ = true;
    cmW();
    b localb = af.cnA();
    localb.qHJ = true;
    localb.agK();
    AppMethodBeat.o(36157);
  }

  public final boolean u(bau parambau)
  {
    AppMethodBeat.i(36200);
    boolean bool;
    if (!this.qIc.containsKey(parambau.Id))
    {
      AppMethodBeat.o(36200);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((Integer)this.qIc.get(parambau.Id)).intValue() == 1)
      {
        AppMethodBeat.o(36200);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(36200);
        bool = false;
      }
    }
  }

  public final boolean v(bau parambau)
  {
    AppMethodBeat.i(36201);
    boolean bool;
    if (!this.qIc.containsKey(parambau.Id))
    {
      AppMethodBeat.o(36201);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((Integer)this.qIc.get(parambau.Id)).intValue() == 2)
      {
        bool = true;
        AppMethodBeat.o(36201);
      }
      else
      {
        AppMethodBeat.o(36201);
        bool = false;
      }
    }
  }

  public final boolean w(bau parambau)
  {
    AppMethodBeat.i(36202);
    boolean bool;
    if (!this.qIc.containsKey(parambau.Id))
    {
      AppMethodBeat.o(36202);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((Integer)this.qIc.get(parambau.Id)).intValue() == 3)
      {
        bool = true;
        AppMethodBeat.o(36202);
      }
      else
      {
        AppMethodBeat.o(36202);
        bool = false;
      }
    }
  }

  public final boolean x(bau parambau)
  {
    AppMethodBeat.i(36203);
    boolean bool;
    if (!this.qIc.containsKey(parambau.Id))
    {
      AppMethodBeat.o(36203);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((Integer)this.qIc.get(parambau.Id)).intValue() == 4)
      {
        bool = true;
        AppMethodBeat.o(36203);
      }
      else
      {
        AppMethodBeat.o(36203);
        bool = false;
      }
    }
  }

  public final void y(bau parambau)
  {
    AppMethodBeat.i(36204);
    this.qIc.put(parambau.Id, Integer.valueOf(1));
    AppMethodBeat.o(36204);
  }

  public final void z(bau parambau)
  {
    AppMethodBeat.i(36205);
    this.qIc.put(parambau.Id, Integer.valueOf(2));
    AppMethodBeat.o(36205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g
 * JD-Core Version:    0.6.2
 */