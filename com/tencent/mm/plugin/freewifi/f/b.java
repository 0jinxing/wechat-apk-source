package com.tencent.mm.plugin.freewifi.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.acl;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static volatile boolean mxG;
  static Pattern mxH;
  static Pattern mxI;

  static
  {
    AppMethodBeat.i(20872);
    mxG = true;
    mxH = Pattern.compile("\"result\":(-?[0-9]+)");
    mxI = Pattern.compile("\"stageName\":\"(.+?)\"");
    AppMethodBeat.o(20872);
  }

  static String U(LinkedList<acl> paramLinkedList)
  {
    AppMethodBeat.i(20871);
    if (paramLinkedList.size() == 0)
    {
      paramLinkedList = "";
      AppMethodBeat.o(20871);
    }
    while (true)
    {
      return paramLinkedList;
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        paramLinkedList = (acl)localIterator.next();
        localStringBuilder.append("|id=").append(m.Mw(paramLinkedList.id)).append("|");
        for (String str : m.Mw(paramLinkedList.wkh).split("\\},"))
        {
          Matcher localMatcher = mxI.matcher(str);
          paramLinkedList = "";
          if (localMatcher.find())
            paramLinkedList = localMatcher.group(1);
          localMatcher = mxH.matcher(str);
          str = "0";
          if (localMatcher.find())
            str = localMatcher.group(1);
          localStringBuilder.append(k.Mu(paramLinkedList) + "=" + str).append("|");
        }
      }
      paramLinkedList = localStringBuilder.toString();
      AppMethodBeat.o(20871);
    }
  }

  public static void kT(int paramInt)
  {
    AppMethodBeat.i(20870);
    j.bza().byI().post(new b.1(paramInt));
    AppMethodBeat.o(20870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.f.b
 * JD-Core Version:    0.6.2
 */