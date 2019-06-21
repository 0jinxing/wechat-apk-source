package com.tencent.mm.plugin.story.model.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.h.a.c;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.storage.az;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/download/StoryImage;", "Lcom/tencent/mm/loader/model/data/ILoaderData;", "mediaObj", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "username", "", "fromscene", "Lcom/tencent/mm/storage/FROM_SCENE;", "(Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;Ljava/lang/String;Lcom/tencent/mm/storage/FROM_SCENE;)V", "getFromscene", "()Lcom/tencent/mm/storage/FROM_SCENE;", "setFromscene", "(Lcom/tencent/mm/storage/FROM_SCENE;)V", "getMediaObj", "()Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "setMediaObj", "(Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;)V", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "uniqueValue", "plugin-story_release"})
public final class d
  implements c
{
  private az qNW;
  cek rVQ;
  String username;

  public d(cek paramcek, String paramString, az paramaz)
  {
    AppMethodBeat.i(109300);
    this.rVQ = paramcek;
    this.username = paramString;
    this.qNW = paramaz;
    AppMethodBeat.o(109300);
  }

  public final String Ui()
  {
    AppMethodBeat.i(109299);
    Object localObject = (CharSequence)this.rVQ.wEH;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label83;
      localObject = this.rVQ.Id + '_' + this.qNW.tag;
      AppMethodBeat.o(109299);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label83: localObject = this.rVQ.wEH + '_' + this.qNW.tag;
      AppMethodBeat.o(109299);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.c.d
 * JD-Core Version:    0.6.2
 */