package com.tencent.mm.bf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ba.n;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class d$a
{
  public int dtS;
  public String fQE;
  public int fQF;
  public int fQG;
  public int fQH;
  public int fQI;
  public int fQJ;
  public int fQK;
  public int fQL;
  public int fQM;
  public int fQN;
  private Random fQO;
  public List<String> fQP;

  public d$a()
  {
    AppMethodBeat.i(116543);
    this.fQE = "BeiJing;GuangZhou;ShangHai;";
    this.dtS = 0;
    this.fQF = 0;
    this.fQG = 2;
    this.fQH = 2;
    this.fQI = 2;
    this.fQJ = 10240;
    this.fQK = 10240000;
    this.fQL = 100;
    this.fQM = 100;
    this.fQN = 100;
    this.fQO = new Random();
    this.fQP = null;
    AppMethodBeat.o(116543);
  }

  private int ajV()
  {
    int i;
    switch (d.chatType)
    {
    default:
      i = this.fQL;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      i = this.fQL;
      continue;
      i = this.fQM;
      continue;
      i = this.fQN;
    }
  }

  public static a ajX()
  {
    AppMethodBeat.i(116546);
    ab.d("upload", "parseFromFile");
    Object localObject1 = com.tencent.mm.ba.r.aix();
    localObject1 = n.aiu() + ((n)localObject1).cx(1, 9);
    int i = (int)com.tencent.mm.vfs.e.asZ((String)localObject1);
    if (i == -1)
    {
      ab.e("upload", "read file failed " + i + (String)localObject1);
      AppMethodBeat.o(116546);
      localObject1 = null;
    }
    Object localObject3;
    while (true)
    {
      return localObject1;
      localObject3 = com.tencent.mm.vfs.e.e((String)localObject1, 0, i);
      if (localObject3 == null)
      {
        ab.e("upload", "read file failed " + i + (String)localObject1);
        AppMethodBeat.o(116546);
        localObject1 = null;
      }
      else
      {
        localObject1 = new String((byte[])localObject3);
        if (!bo.isNullOrNil((String)localObject1))
          break;
        AppMethodBeat.o(116546);
        localObject1 = null;
      }
    }
    i = ((String)localObject1).indexOf('<');
    if (i > 0)
      localObject1 = ((String)localObject1).substring(i);
    while (true)
    {
      int j = ((String)localObject1).hashCode();
      localObject3 = (a)d.ajS().get(Integer.valueOf(j));
      if (localObject3 != null)
      {
        AppMethodBeat.o(116546);
        localObject1 = localObject3;
        break;
      }
      Map localMap = br.z((String)localObject1, "Config");
      if (localMap == null)
      {
        ab.e("upload", "parse msg failed");
        AppMethodBeat.o(116546);
        localObject1 = null;
        break;
      }
      label636: 
      do
      {
        while (true)
        {
          try
          {
            localObject3 = new com/tencent/mm/bf/d$a;
            ((a)localObject3).<init>();
            i = 0;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>(".Config.Item");
            if (i == 0)
            {
              localObject1 = "";
              localObject1 = (String)localMap.get(localObject1 + ".$key");
              ab.d("upload", "key ".concat(String.valueOf(localObject1)));
              if (localObject1 == null)
                break label1177;
              if (!((String)localObject1).equals("region"))
                continue;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>(".Config.Item");
              if (i == 0)
              {
                localObject1 = "";
                ((a)localObject3).fQE = ((String)localMap.get(localObject1));
                if ((((a)localObject3).fQE == null) || (((a)localObject3).fQE.length() <= 0))
                  continue;
                localObject1 = ((a)localObject3).fQE.split(";");
                localObject4 = new java/util/ArrayList;
                ((ArrayList)localObject4).<init>();
                ((a)localObject3).fQP = ((List)localObject4);
                if ((localObject1 == null) || (localObject1.length <= 0))
                  continue;
                int k = 0;
                if (k >= localObject1.length)
                  continue;
                if ((localObject1[k] != null) && (localObject1[k].length() > 0))
                  ((a)localObject3).fQP.add(localObject1[k]);
                k++;
                continue;
              }
            }
            else
            {
              localObject1 = Integer.valueOf(i);
              continue;
            }
            localObject1 = Integer.valueOf(i);
            continue;
            if (((String)localObject1).equals("sex"))
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>(".Config.Item");
              if (i == 0)
              {
                localObject1 = "";
                ((a)localObject3).dtS = bo.getInt((String)localMap.get(localObject1), 0);
                i++;
                continue;
              }
              localObject1 = Integer.valueOf(i);
              continue;
            }
            if (!((String)localObject1).equals("rate"))
              break label644;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>(".Config.Item");
            if (i != 0)
              break label636;
            localObject1 = "";
            ((a)localObject3).fQF = bo.getInt((String)localMap.get(localObject1), 0);
            continue;
          }
          catch (Exception localException)
          {
            ab.e("upload", "exception:%s", new Object[] { bo.l(localException) });
            AppMethodBeat.o(116546);
            localObject2 = null;
          }
          break;
          localObject2 = Integer.valueOf(i);
        }
        if (((String)localObject2).equals("minsize"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQJ = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("maxsize"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQK = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_single"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQL = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_chatroom"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQM = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("daycount_app"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQN = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("rate_single"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQG = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
        if (((String)localObject2).equals("rate_chatroom"))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(".Config.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            ((a)localObject3).fQH = bo.getInt((String)localMap.get(localObject2), 0);
            break;
          }
        }
      }
      while (!((String)localObject2).equals("rate_app"));
      label644: Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(".Config.Item");
      if (i == 0);
      for (Object localObject2 = ""; ; localObject2 = Integer.valueOf(i))
      {
        ((a)localObject3).fQI = bo.getInt((String)localMap.get(localObject2), 0);
        break;
      }
      label1177: localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("sex ");
      ab.d("upload", ((a)localObject3).dtS);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("rate_single ");
      ab.d("upload", ((a)localObject3).fQG);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("rate_chatroom ");
      ab.d("upload", ((a)localObject3).fQH);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("rate_app ");
      ab.d("upload", ((a)localObject3).fQI);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("rate ");
      ab.d("upload", ((a)localObject3).fQF);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("minsize ");
      ab.d("upload", ((a)localObject3).fQJ);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("maxsize ");
      ab.d("upload", ((a)localObject3).fQK);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("daycount_single ");
      ab.d("upload", ((a)localObject3).fQL);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("daycount_chatroom ");
      ab.d("upload", ((a)localObject3).fQM);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("daycount_app ");
      ab.d("upload", ((a)localObject3).fQN);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("region ");
      ab.d("upload", ((a)localObject3).fQE);
      d.ajS().k(Integer.valueOf(j), localObject3);
      AppMethodBeat.o(116546);
      localObject2 = localObject3;
      break;
    }
  }

  public final boolean ajT()
  {
    boolean bool = false;
    AppMethodBeat.i(116544);
    Object localObject1 = com.tencent.mm.model.r.Zd();
    Object localObject2;
    int i;
    if ("  getRegionCode ".concat(String.valueOf(localObject1)) != null)
    {
      localObject2 = ((ap)localObject1).dui;
      ab.d("upload", (String)localObject2);
      localObject2 = ((ap)localObject1).dui;
      if ((localObject2 == null) || (((String)localObject2).length() <= 0) || (this.fQP == null) || (this.fQP.size() <= 0))
        break label195;
      localObject2 = ((String)localObject2).split("_");
      if ((localObject2 == null) || (localObject2.length <= 0))
        break label195;
      i = 0;
      label91: if (i >= localObject2.length)
        break label195;
      if ((localObject2[i] == null) || (localObject2[i].length() <= 0))
        break label189;
      localObject1 = this.fQP.iterator();
      while (((Iterator)localObject1).hasNext())
        if (((String)((Iterator)localObject1).next()).trim().toLowerCase().equals(localObject2[i].trim().toLowerCase()))
        {
          ab.d("upload", "isInRegion");
          bool = true;
          AppMethodBeat.o(116544);
        }
    }
    while (true)
    {
      return bool;
      localObject2 = "";
      break;
      label189: i++;
      break label91;
      label195: AppMethodBeat.o(116544);
    }
  }

  public final int ajU()
  {
    int i;
    switch (d.chatType)
    {
    default:
      i = this.fQG;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      i = this.fQG;
      continue;
      i = this.fQH;
      continue;
      i = this.fQI;
    }
  }

  public final boolean ajW()
  {
    boolean bool1 = false;
    AppMethodBeat.i(116545);
    boolean bool2;
    if (1 == com.tencent.mm.audio.b.g.x("EnableSpeexVoiceUpload", 0))
    {
      AppMethodBeat.o(116545);
      bool2 = true;
    }
    while (true)
    {
      return bool2;
      ab.d("upload", "type " + d.chatType);
      int i = ajV();
      int j = ajU();
      com.tencent.mm.kernel.g.RQ();
      Integer localInteger = Integer.valueOf(bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(16646145, null)));
      ab.d("upload", "daycount " + ajV() + "  count " + localInteger + " rate " + j);
      if (localInteger.intValue() > i)
      {
        AppMethodBeat.o(116545);
        bool2 = bool1;
      }
      else if (j == 0)
      {
        AppMethodBeat.o(116545);
        bool2 = bool1;
      }
      else if (!at.isWifi(ah.getContext()))
      {
        AppMethodBeat.o(116545);
        bool2 = bool1;
      }
      else
      {
        com.tencent.mm.kernel.g.RQ();
        i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12290, null), 0);
        if (this.dtS == 0)
          bool2 = true;
        while (true)
        {
          ab.d("upload", "fitSex " + this.dtS + " " + bool2 + " " + this.dtS);
          if (bool2)
            break label310;
          AppMethodBeat.o(116545);
          bool2 = bool1;
          break;
          if (this.dtS == i)
            bool2 = true;
          else
            bool2 = false;
        }
        label310: if (!ajT())
        {
          AppMethodBeat.o(116545);
          bool2 = bool1;
        }
        else
        {
          i = this.fQO.nextInt(j);
          ab.d("upload", "luck ".concat(String.valueOf(i)));
          if (i == j / 2)
          {
            AppMethodBeat.o(116545);
            bool2 = true;
          }
          else
          {
            AppMethodBeat.o(116545);
            bool2 = bool1;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.d.a
 * JD-Core Version:    0.6.2
 */