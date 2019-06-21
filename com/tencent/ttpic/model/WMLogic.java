package com.tencent.ttpic.model;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.DateUtils;
import com.tencent.ttpic.logic.watermark.LogicDataManager;
import com.tencent.ttpic.util.VideoPrefsUtil;
import com.tencent.util.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WMLogic
{
  private static final String TAG;
  private static final String TYPE_CASE = "case";
  public static final String TYPE_COUNTDOWN = "countdown";
  private static final String TYPE_RANGE = "range";
  public static final String TYPE_SINCE = "since";
  public String compare;
  public String data;
  public List<WMLogicPair> range;
  public String type;
  public List<WMLogicPair> wmcase;

  static
  {
    AppMethodBeat.i(83601);
    TAG = WMLogic.class.getSimpleName();
    AppMethodBeat.o(83601);
  }

  public String getValue(String paramString)
  {
    AppMethodBeat.i(83600);
    String str = "";
    Object localObject;
    if (this.type.equals("case"))
    {
      paramString = LogicDataManager.getInstance().getValue(this.data);
      Iterator localIterator = this.wmcase.iterator();
      do
      {
        localObject = str;
        if (!localIterator.hasNext())
          break;
        localObject = (WMLogicPair)localIterator.next();
      }
      while (!((WMLogicPair)localObject).key.equals(paramString));
      localObject = ((WMLogicPair)localObject).value;
    }
    int i;
    while (true)
    {
      AppMethodBeat.o(83600);
      return localObject;
      if (!this.type.equals("range"))
        break;
      try
      {
        paramString = LogicDataManager.getInstance().getValue(this.data);
        for (i = this.range.size() - 1; ; i--)
        {
          localObject = str;
          if (i < 0)
            break;
          if ((Integer.parseInt(paramString) >= Integer.parseInt(((WMLogicPair)this.range.get(i)).key)) || (i == 0))
          {
            localObject = ((WMLogicPair)this.range.get(i)).value;
            break;
          }
        }
      }
      catch (NumberFormatException paramString)
      {
        i.m(TAG, paramString.getMessage());
        localObject = str;
      }
    }
    label243: int j;
    if (this.type.equals("since"))
    {
      localObject = new SimpleDateFormat("yyyy-MM-dd");
      if (!TextUtils.isEmpty(paramString))
      {
        j = DateUtils.daysBetween(paramString, ((SimpleDateFormat)localObject).format(new Date()));
        i = 0;
        label264: if (i >= this.range.size())
          break label536;
        if ((j > Integer.parseInt(((WMLogicPair)this.range.get(i)).key)) && (i != this.range.size() - 1))
          break label366;
      }
    }
    label536: for (paramString = ((WMLogicPair)this.range.get(i)).value; ; paramString = "")
    {
      localObject = String.format(paramString, new Object[] { Integer.valueOf(j) });
      break;
      paramString = this.compare;
      break label243;
      label366: i++;
      break label264;
      localObject = str;
      if (!this.type.equals("countdown"))
        break;
      localObject = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      if (!TextUtils.isEmpty(paramString))
        label415: j = DateUtils.daysBetween((String)localObject, paramString);
      for (i = 0; ; i++)
      {
        paramString = str;
        if (i < this.range.size())
        {
          if ((j <= Integer.parseInt(((WMLogicPair)this.range.get(i)).key)) || (i == this.range.size() - 1))
            paramString = ((WMLogicPair)this.range.get(i)).value;
        }
        else
        {
          localObject = String.format(paramString, new Object[] { Integer.valueOf(j) });
          break;
          paramString = this.compare;
          break label415;
        }
      }
    }
  }

  public void setCompare(String paramString1, String paramString2)
  {
    AppMethodBeat.i(83599);
    if (this.type.equals("since"))
    {
      paramString2 = VideoPrefsUtil.getDefaultPrefs().getString("prefs_key_watermark_since_".concat(String.valueOf(paramString2)), "");
      if (!TextUtils.isEmpty(paramString2))
        paramString1 = paramString2;
      this.compare = paramString1;
      AppMethodBeat.o(83599);
    }
    while (true)
    {
      return;
      if (this.type.equals("countdown"))
      {
        paramString2 = VideoPrefsUtil.getDefaultPrefs().getString("prefs_key_watermark_countdown_".concat(String.valueOf(paramString2)), "");
        if (!TextUtils.isEmpty(paramString2))
          paramString1 = paramString2;
        this.compare = paramString1;
        AppMethodBeat.o(83599);
      }
      else
      {
        this.compare = paramString1;
        AppMethodBeat.o(83599);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.WMLogic
 * JD-Core Version:    0.6.2
 */