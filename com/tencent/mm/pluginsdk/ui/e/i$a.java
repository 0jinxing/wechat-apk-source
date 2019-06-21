package com.tencent.mm.pluginsdk.ui.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Pattern;

public final class i$a
{
  public static final Pattern vrG;
  public static final Pattern vrH;
  public static final Pattern vrI;
  public static final Pattern vrJ;
  public static final Pattern vrK;
  public static final Pattern vrL;
  public static final Pattern vrM;
  public static final Pattern vrN;
  public static final Pattern vrO;
  public static final Pattern vrP;
  public static final Pattern vrQ;
  public static Pattern vrR;
  public static final Pattern vrS;
  public static final Pattern vrT;
  public static final Pattern vrU;
  public static final Pattern vrV;
  public static final Pattern vrW;

  static
  {
    AppMethodBeat.i(79818);
    vrG = Pattern.compile("<a.{1,500}?href\\s*=\\s*[\"|']\\s*(\\S+?)\\s*[\"|']\\s*>(.+?)</a>");
    vrH = Pattern.compile("<a.{1,100}?href\\s*=\\s*[\"|']\\s*(\\S+?)\\s*[\"|']\\s*>(.+?)</a>");
    vrI = Pattern.compile("<a.{1,500}?href\\s*=\\s*[\"|']\\s*(.{1,500}?)\\s*[\"|']\\s*>(.+?)</a>");
    vrJ = Pattern.compile("<a.{1,300}?href\\s*=\\s*[\"|']\\s*(.{1,300}?)\\s*[\"|']\\s*>(.+?)</a>");
    vrK = Pattern.compile("<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*href\\s*=\\s*[\"|']\\s*(.*?)\\s*[\"|']\\s*.*?>(.+?)</_wc_custom_link_>");
    vrL = Pattern.compile("<_wc_custom_link_.+?\\s*href\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*>(.+?)</_wc_custom_link_>");
    vrM = Pattern.compile("<img.+?src=\"(.+?).png\"/>\\s*");
    vrN = Pattern.compile("weixin://\\S+");
    vrO = Pattern.compile("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([-_a-zA-Z0-9]([-_a-zA-Z0-9\\-]{0,61}[-_a-zA-Z0-9]){0,1}\\.)+[a-zA-Z]{2,6}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)(\\/(?:(?:[-_a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?", 2);
    vrP = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");
    vrQ = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9._-]+\\.[A-Z]+", 2);
    vrR = Pattern.compile("#冒泡#");
    vrS = Pattern.compile("\\+?(\\d{2,8}([- ]?\\d{3,8}){2,6}|\\d{5,20})");
    vrT = Pattern.compile("weixin://wxpay/\\S+");
    vrU = Pattern.compile("weixin://dl/\\w+");
    vrV = Pattern.compile("weixin://dl/business(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~%\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
    vrW = Pattern.compile("\\d{1,5}\\s(\\w+[\\s,.]+){2,8}\\d{5}(-\\d{4})?([\\s,]*USA)?", 2);
    AppMethodBeat.o(79818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.i.a
 * JD-Core Version:    0.6.2
 */