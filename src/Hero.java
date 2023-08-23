public abstract class Hero  implements HavingSuperAbility{
    int heals;
    int damage;
    String type;

    @Override
    public abstract void applySuperAbility();
}
