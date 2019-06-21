package com.tencent.mm.plugin.story.h;

import a.f.b.j;
import a.l;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eq;
import com.tencent.mm.sdk.e.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "Lcom/tencent/mm/autogen/table/BaseStoryEditorInfo;", "()V", "value", "", "available", "getAvailable", "()Z", "setAvailable", "(Z)V", "", "baseItemData", "getBaseItemData", "()[B", "setBaseItemData", "([B)V", "localId", "", "getLocalId", "()J", "setLocalId", "(J)V", "", "mixFlag", "getMixFlag", "()I", "setMixFlag", "(I)V", "mixRetryTime", "getMixRetryTime", "setMixRetryTime", "storyLocalId", "getStoryLocalId", "setStoryLocalId", "timeStamp", "getTimeStamp", "setTimeStamp", "convertFrom", "", "cu", "Landroid/database/Cursor;", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "toString", "", "Companion", "plugin-story_release"})
public final class d extends eq
{
  private static final c.a ccO;
  public static final d.a sdF;
  private long fDy;

  static
  {
    AppMethodBeat.i(109864);
    sdF = new d.a((byte)0);
    ccO = eq.Hm();
    AppMethodBeat.o(109864);
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109862);
    c.a locala = ccO;
    j.o(locala, "info");
    AppMethodBeat.o(109862);
    return locala;
  }

  public final boolean cBG()
  {
    if (this.field_available != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(109861);
    j.p(paramCursor, "cu");
    super.d(paramCursor);
    this.fDy = this.xDa;
    AppMethodBeat.o(109861);
  }

  public final String toString()
  {
    AppMethodBeat.i(109863);
    String str = this.field_timeStamp + ", " + this.xDa + ", " + this.field_mixFlag;
    AppMethodBeat.o(109863);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.d
 * JD-Core Version:    0.6.2
 */