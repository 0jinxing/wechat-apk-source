package com.tencent.mm.pluginsdk.h.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class a
{
  public static final String[] vfO = { "LDPI", "HDPI", "MDPI" };
  public String desc;
  public String device;
  public String fnT;
  public String fnU;
  public String id;
  public int pHl;
  public String platform;
  public String title;
  public String url;
  public boolean vfI;
  public boolean vfJ;
  public int vfK;
  public Rect vfL;
  public Rect vfM;
  public Map<String, String> vfN;

  private a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.id = paramString1;
    this.platform = paramString2;
    this.device = paramString3;
    this.vfI = paramBoolean1;
    this.vfJ = paramBoolean2;
  }

  public static String ajk(String paramString)
  {
    AppMethodBeat.i(27453);
    Object localObject = ajl(paramString);
    if (localObject == a.a.vfP)
      AppMethodBeat.o(27453);
    while (true)
    {
      return paramString;
      if (localObject == a.a.vfQ)
      {
        if (paramString == null)
          paramString = null;
        while (true)
        {
          if (paramString != null)
            break label91;
          AppMethodBeat.o(27453);
          paramString = null;
          break;
          int i = paramString.lastIndexOf("/");
          if ((i < 0) || (i >= paramString.length() - 1))
            paramString = null;
          else
            paramString = paramString.substring(i + 1);
        }
        label91: localObject = new StringBuilder();
        aw.ZK();
        paramString = c.XW() + paramString;
        AppMethodBeat.o(27453);
      }
      else
      {
        AppMethodBeat.o(27453);
        paramString = null;
      }
    }
  }

  public static a.a ajl(String paramString)
  {
    AppMethodBeat.i(27454);
    if (paramString.indexOf("tips/") == 0)
    {
      paramString = a.a.vfP;
      AppMethodBeat.o(27454);
    }
    while (true)
    {
      return paramString;
      if (paramString.indexOf("weixin://") == 0)
      {
        paramString = a.a.vfQ;
        AppMethodBeat.o(27454);
      }
      else
      {
        paramString = a.a.vfR;
        AppMethodBeat.o(27454);
      }
    }
  }

  public static ArrayList<a> bA(Context paramContext, String paramString)
  {
    AppMethodBeat.i(27455);
    if ((paramString == null) || (paramString.length() < 0))
    {
      paramContext = null;
      AppMethodBeat.o(27455);
    }
    while (true)
    {
      return paramContext;
      Object localObject1 = paramContext.getResources().getDisplayMetrics();
      Object localObject2 = ((DisplayMetrics)localObject1).heightPixels + "x" + ((DisplayMetrics)localObject1).widthPixels;
      if (localObject2 == null)
      {
        paramContext = null;
        if ((paramContext == null) || (paramContext.size() <= 0))
        {
          paramContext = null;
          AppMethodBeat.o(27455);
        }
      }
      else
      {
        localObject1 = new HashSet();
        ((HashSet)localObject1).add(localObject2);
        paramContext = BackwardSupportUtil.b.gi(paramContext);
        ab.d("MicroMsg.PushMessage", "getDisplaySizeType :".concat(String.valueOf(paramContext)));
        if (paramContext != null)
        {
          paramContext = paramContext.split("_");
          if ((paramContext != null) && (paramContext.length >= 2))
            break label202;
        }
        label202: for (paramContext = null; ; paramContext = paramContext[0])
        {
          ((HashSet)localObject1).add(paramContext + "_L");
          ((HashSet)localObject1).add(paramContext + "_P");
          paramContext = (Context)localObject1;
          break;
        }
        localObject2 = br.z(paramString, "tips");
        if (localObject2 == null)
        {
          paramContext = null;
          AppMethodBeat.o(27455);
        }
        else
        {
          localObject1 = new ArrayList();
          for (int i = 0; ; i++)
          {
            Object localObject3 = new StringBuilder(".tips.tip");
            Object localObject4;
            a locala;
            int i1;
            label1145: Object localObject5;
            if (i > 0)
            {
              paramString = Integer.valueOf(i);
              localObject3 = paramString;
              if (((Map)localObject2).get(localObject3) == null)
                break;
              paramString = (String)((Map)localObject2).get((String)localObject3 + ".$id");
              ab.d("MicroMsg.PushMessage", "parseMessages id:".concat(String.valueOf(paramString)));
              localObject4 = (String)((Map)localObject2).get((String)localObject3 + ".$platform");
              if (!((String)localObject4).equals("android"))
                continue;
              locala = new a(paramString, (String)localObject4, (String)((Map)localObject2).get((String)localObject3 + ".$device"), bo.d(Boolean.valueOf((String)((Map)localObject2).get((String)localObject3 + ".$enableclose"))), bo.d(Boolean.valueOf((String)((Map)localObject2).get((String)localObject3 + ".$transparentclose"))));
              int j = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".title.$x"), 0);
              int k = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".title.$y"), 0);
              int m = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".title.$width"), 0);
              int n = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".title.$font"), 0);
              i1 = bo.anc((String)((Map)localObject2).get((String)localObject3 + ".title.$color"));
              locala.title = ((String)((Map)localObject2).get((String)localObject3 + ".title"));
              locala.vfK = i1;
              locala.vfL = new Rect(j, k, m + j, n + k);
              j = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".description.$x"), 0);
              n = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".description.$y"), 0);
              k = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".description.$width"), 0);
              m = bo.getInt((String)((Map)localObject2).get((String)localObject3 + ".description.$font"), 0);
              i1 = bo.anc((String)((Map)localObject2).get((String)localObject3 + ".description.$color"));
              locala.desc = ((String)((Map)localObject2).get((String)localObject3 + ".description"));
              locala.pHl = i1;
              locala.vfM = new Rect(j, n, k + j, m + n);
              locala.url = ((String)((Map)localObject2).get((String)localObject3 + ".url"));
              locala.fnT = ((String)((Map)localObject2).get((String)localObject3 + ".time.start"));
              locala.fnU = ((String)((Map)localObject2).get((String)localObject3 + ".time.end"));
              ab.d("MicroMsg.PushMessage", "parseMessages id:" + locala.id + " start:" + locala.fnT + " end:" + locala.fnU);
              localObject4 = new HashMap();
              i1 = 0;
              localObject5 = new StringBuilder().append((String)localObject3).append(".images.image");
              if (i1 <= 0)
                break label1281;
            }
            label1281: for (paramString = Integer.valueOf(i1); ; paramString = "")
            {
              localObject5 = paramString;
              paramString = (String)((Map)localObject2).get(localObject5);
              ab.d("MicroMsg.PushMessage", " img res:".concat(String.valueOf(paramString)));
              if (paramString == null)
                break label1288;
              localObject5 = (String)((Map)localObject2).get((String)localObject5 + ".$type");
              if (paramContext.contains(localObject5))
                ((HashMap)localObject4).put(localObject5, paramString);
              i1++;
              break label1145;
              paramString = "";
              break;
            }
            label1288: if (((HashMap)localObject4).size() > 0)
              locala.vfN = ((Map)localObject4);
            ab.d("MicroMsg.PushMessage", "msgid :" + locala.id);
            ((ArrayList)localObject1).add(locala);
          }
          ab.d("MicroMsg.PushMessage", "msgs size: " + ((ArrayList)localObject1).size());
          if (((ArrayList)localObject1).size() > 0)
          {
            AppMethodBeat.o(27455);
            paramContext = (Context)localObject1;
          }
          else
          {
            paramContext = null;
            AppMethodBeat.o(27455);
          }
        }
      }
    }
  }

  private boolean diC()
  {
    boolean bool = false;
    AppMethodBeat.i(27451);
    long l1 = bo.anU();
    long l2 = 9223372036854775807L;
    long l3 = 0L;
    try
    {
      if (this.fnU != null)
      {
        localObject = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject).<init>("yyyy-MM-dd-HH");
        l2 = ((SimpleDateFormat)localObject).parse(this.fnU).getTime();
      }
      if (this.fnT != null)
      {
        localObject = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject).<init>("yyyy-MM-dd-HH");
        l3 = ((SimpleDateFormat)localObject).parse(this.fnT).getTime();
      }
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("CHECKTIME : [");
      ab.d("MicroMsg.PushMessage", l3 + "," + l2 + "]");
      if (l2 > l1)
        if (l3 > l1)
        {
          AppMethodBeat.o(27451);
          return bool;
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(27451);
        bool = true;
        continue;
        AppMethodBeat.o(27451);
        bool = true;
        continue;
        AppMethodBeat.o(27451);
      }
    }
  }

  public static void diD()
  {
    AppMethodBeat.i(27456);
    aw.ZK();
    c.Ry().set(8193, "");
    aw.ZK();
    c.Ry().set(8449, Long.valueOf(0L));
    AppMethodBeat.o(27456);
  }

  public static a fO(Context paramContext)
  {
    int i = 1;
    AppMethodBeat.i(27457);
    aw.ZK();
    long l1 = bo.g(c.Ry().get(8449, null), 0);
    long l2 = bo.anT();
    if ((l1 > 0L) && (l2 - l1 >= 86400L))
    {
      diD();
      AppMethodBeat.o(27457);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      aw.ZK();
      Object localObject = (String)c.Ry().get(8193, null);
      if (bo.isNullOrNil((String)localObject))
        break;
      if (((String)localObject).contains("id=\"setavatar\""))
      {
        diD();
        break;
      }
      if (!bo.isNullOrNil((String)localObject))
      {
        paramContext = bA(paramContext, (String)localObject);
        if ((paramContext == null) || (paramContext.size() != 1))
        {
          paramContext = null;
          if (paramContext != null)
            break label202;
          diD();
          break;
        }
        localObject = (a)paramContext.get(0);
        if ((((a)localObject).vfN == null) || (((a)localObject).vfN.size() <= 0))
          break label197;
      }
      while (true)
      {
        if (i != 0)
        {
          paramContext = (Context)localObject;
          if (((a)localObject).diC())
            break;
        }
        paramContext = null;
        break;
        label197: i = 0;
      }
      label202: AppMethodBeat.o(27457);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(27452);
    StringBuilder localStringBuilder = new StringBuilder("ad.id=").append(this.id).append(", platform=").append(this.platform).append(", device=").append(this.device);
    if (this.vfI)
    {
      str = ", closable";
      localStringBuilder = localStringBuilder.append(str);
      if (!this.vfJ)
        break label102;
    }
    label102: for (String str = ", trans-closable"; ; str = "")
    {
      str = str;
      AppMethodBeat.o(27452);
      return str;
      str = "";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.h.a.a
 * JD-Core Version:    0.6.2
 */