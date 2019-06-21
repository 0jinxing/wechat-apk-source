package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static final Pattern qPU;
  public static String[] qPV;
  public static HashMap<String, f.a> qPW;

  static
  {
    AppMethodBeat.i(36809);
    qPU = Pattern.compile("\\{([\\s\\S]*?)\\}");
    qPV = new String[] { "{sex", "{username", "{richtext" };
    qPW = new HashMap();
    AppMethodBeat.o(36809);
  }

  public static String a(d.a parama)
  {
    AppMethodBeat.i(36808);
    if (qPW.containsKey(parama.qPR))
      if ((f.a)qPW.get(parama.qPR) == f.a.qPX)
      {
        parama = parama.qPR;
        AppMethodBeat.o(36808);
      }
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return parama;
      parama = parama.qPQ;
      AppMethodBeat.o(36808);
      continue;
      localObject1 = parama.qPR;
      localObject2 = localObject1;
      if (!bo.isNullOrNil((String)localObject1))
        break;
      parama = parama.qPQ;
      AppMethodBeat.o(36808);
    }
    label154: label240: label243: 
    while (true)
    {
      localObject1 = qPU.matcher((CharSequence)localObject2);
      if (((Matcher)localObject1).find())
      {
        i = ((Matcher)localObject1).groupCount();
        localObject1 = ((Matcher)localObject1).group();
        ab.i("MicroMsg.SnsAbTestUtil", "hello matcher group() " + i + " " + (String)localObject1);
        localObject2 = ((String)localObject2).replace((CharSequence)localObject1, "");
        i = 0;
        if (i >= qPV.length)
          break label240;
        if (((String)localObject1).indexOf(qPV[i]) < 0);
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label243;
        qPW.put(parama.qPR, f.a.qPY);
        parama = parama.qPQ;
        AppMethodBeat.o(36808);
        break;
        i++;
        break label154;
        qPW.put(parama.qPR, f.a.qPX);
        parama = parama.qPR;
        AppMethodBeat.o(36808);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.f
 * JD-Core Version:    0.6.2
 */