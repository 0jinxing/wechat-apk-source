package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WWMediaMergedConvs extends WWMediaMessage.WWMediaObject
{
  public List<WWMediaConversation> ALH;

  public WWMediaMergedConvs()
  {
    AppMethodBeat.i(80505);
    this.ALH = new ArrayList();
    AppMethodBeat.o(80505);
  }

  public final boolean a(WWMediaConversation paramWWMediaConversation)
  {
    AppMethodBeat.i(80506);
    boolean bool;
    if (paramWWMediaConversation.checkArgs())
    {
      this.ALH.add(paramWWMediaConversation);
      bool = true;
      AppMethodBeat.o(80506);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80506);
    }
  }

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80507);
    if (!super.checkArgs())
      AppMethodBeat.o(80507);
    while (true)
    {
      return bool;
      if ((this.ALH != null) && (this.ALH.size() != 0))
        break;
      AppMethodBeat.o(80507);
    }
    Iterator localIterator = this.ALH.iterator();
    do
      if (!localIterator.hasNext())
        break;
    while (((BaseMessage)localIterator.next()).checkArgs());
    for (bool = false; ; bool = true)
    {
      AppMethodBeat.o(80507);
      break;
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80508);
    paramBundle.putInt("_wwmergedconvobject_messageslen", this.ALH.size());
    for (int i = 0; i < this.ALH.size(); i++)
      paramBundle.putBundle("_wwmergedconvobject_messages".concat(String.valueOf(i)), BaseMessage.b((BaseMessage)this.ALH.get(i)));
    super.toBundle(paramBundle);
    AppMethodBeat.o(80508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaMergedConvs
 * JD-Core Version:    0.6.2
 */