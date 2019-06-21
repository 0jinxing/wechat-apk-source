package com.tencent.mm.accessibility;

import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.List;

public class AccessibilityCapture$ViewSearchTask
  implements Runnable
{
  private long elapsedTime = 0L;
  private final AccessibilityEvent mEvent;

  public AccessibilityCapture$ViewSearchTask(AccessibilityEvent paramAccessibilityEvent, long paramLong)
  {
    this.mEvent = paramAccessibilityEvent;
    this.elapsedTime = paramLong;
  }

  private int findAccessibilityId()
  {
    AppMethodBeat.i(118627);
    try
    {
      localField1 = AccessibilityRecord.class.getDeclaredField("mSourceNodeId");
    }
    catch (NoSuchFieldException localNoSuchFieldException1)
    {
      try
      {
        while (true)
        {
          Field localField1;
          localField1.setAccessible(true);
          l = ((Long)localField1.get(this.mEvent)).longValue();
          i = (int)l;
          AppMethodBeat.o(118627);
          return i;
          localNoSuchFieldException1 = localNoSuchFieldException1;
          Field localField2 = AccessibilityRecord.class.getDeclaredField("mSourceViewId");
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException2)
      {
        while (true)
        {
          Object localObject2;
          AccessibilityIdNotFoundException localAccessibilityIdNotFoundException;
          try
          {
            Object localObject1 = AccessibilityNodeInfo.class.getDeclaredField("mSourceNodeId");
            localObject2 = AccessibilityRecord.class.getDeclaredField("mSealed");
            ((Field)localObject2).setAccessible(true);
            ((Field)localObject2).set(this.mEvent, Boolean.TRUE);
            localObject2 = this.mEvent.getSource();
            if (localObject2 == null)
            {
              localObject1 = new com/tencent/mm/accessibility/AccessibilityIdNotFoundException;
              ((AccessibilityIdNotFoundException)localObject1).<init>();
              AppMethodBeat.o(118627);
              throw ((Throwable)localObject1);
            }
          }
          catch (NoSuchFieldException localNoSuchFieldException3)
          {
            localAccessibilityIdNotFoundException = new AccessibilityIdNotFoundException(localNoSuchFieldException3);
            AppMethodBeat.o(118627);
            throw localAccessibilityIdNotFoundException;
          }
          localAccessibilityIdNotFoundException.setAccessible(true);
          long l = ((Long)localAccessibilityIdNotFoundException.get(localObject2)).longValue();
          int i = (int)l;
        }
      }
    }
  }

  private View searchViewByAccessibilityId(int paramInt)
  {
    AppMethodBeat.i(118629);
    try
    {
      ViewSearchTool localViewSearchTool = new com/tencent/mm/accessibility/ViewSearchTool;
      localViewSearchTool.<init>();
      Object localObject1 = new com/tencent/mm/accessibility/AccessibilityCapture$ViewSearchTask$1;
      ((AccessibilityCapture.ViewSearchTask.1)localObject1).<init>(this, paramInt);
      localObject1 = localViewSearchTool.findView((ViewSearchTool.Matcher)localObject1);
      if ((localObject1 != null) && (((List)localObject1).size() == 1))
      {
        localObject1 = (View)((List)localObject1).get(0);
        AppMethodBeat.o(118629);
        return localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AccessibilityCapture.access$600().e("MicroMsg.AccessibilityCapture", "exception when find root", new Object[] { localException });
        Object localObject2 = null;
        AppMethodBeat.o(118629);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label82: break label82;
    }
  }

  public void run()
  {
    AppMethodBeat.i(118628);
    if (this.mEvent == null)
      AppMethodBeat.o(118628);
    while (true)
    {
      return;
      try
      {
        long l1 = SystemClock.elapsedRealtime();
        View localView = searchViewByAccessibilityId(findAccessibilityId());
        AccessibilityCapture.access$800(this.mEvent, localView, this.elapsedTime);
        long l2 = SystemClock.elapsedRealtime();
        AccessibilityCapture.access$600().i("MicroMsg.AccessibilityCapture", "analysis event %s, cost %dms", new Object[] { AccessibilityEvent.eventTypeToString(this.mEvent.getEventType()), Long.valueOf(l2 - l1) });
        try
        {
          this.mEvent.recycle();
          AppMethodBeat.o(118628);
        }
        catch (Throwable localThrowable1)
        {
          AccessibilityCapture.access$600().e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable1 });
          AppMethodBeat.o(118628);
        }
      }
      catch (Throwable localThrowable2)
      {
        localThrowable2 = localThrowable2;
        AccessibilityCapture.access$600().i("MicroMsg.AccessibilityCapture", "unable get node id", new Object[] { localThrowable2 });
        try
        {
          this.mEvent.recycle();
          AppMethodBeat.o(118628);
        }
        catch (Throwable localThrowable3)
        {
          AccessibilityCapture.access$600().e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable3 });
          AppMethodBeat.o(118628);
        }
      }
      finally
      {
      }
    }
    try
    {
      this.mEvent.recycle();
      AppMethodBeat.o(118628);
      throw localObject;
    }
    catch (Throwable localThrowable4)
    {
      while (true)
        AccessibilityCapture.access$600().e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable4 });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityCapture.ViewSearchTask
 * JD-Core Version:    0.6.2
 */