package interfaceServices;

import models.CharacterEntity;

import java.util.List;
import java.util.Optional;

public interface InterfaceCharacterServices {
    public List<CharacterEntity>toList();
    public Optional<CharacterEntity>toListId(int id);
    public int save (CharacterEntity characterEntity);
    public void delete(int id);

}
