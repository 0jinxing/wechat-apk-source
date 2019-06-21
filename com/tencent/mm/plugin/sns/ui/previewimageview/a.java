package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.widget.BaseAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class a extends BaseAdapter
  implements d
{
  private int rKI = 0;
  HashMap<Object, Integer> rKJ = new HashMap();

  protected final void cq(Object paramObject)
  {
    HashMap localHashMap = this.rKJ;
    int i = this.rKI;
    this.rKI = (i + 1);
    localHashMap.put(paramObject, Integer.valueOf(i));
  }

  protected final void dx(List<?> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
      cq(paramList.next());
  }

  public final long getItemId(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.rKJ.size()));
    Object localObject;
    for (long l = -1L; ; l = ((Integer)this.rKJ.get(localObject)).intValue())
    {
      return l;
      localObject = getItem(paramInt);
    }
  }

  public final boolean hasStableIds()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.a
 * JD-Core Version:    0.6.2
 */